import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sales {

	private String[] date;
	private String[] customer;
	private String[] product;
	private double[] quantity;
	private double[] rate;
	private double[] amount;
	private double[] payment;
	private String name;
	private int lastindex;
	

	public Sales(String name) {
		date = new String[999999];
		customer = new String[999999];
		product = new String[999999];
		quantity = new double[999999];
		rate = new double[999999];
		amount = new double[999999];
		payment = new double[999999];
		this.name=name;
		
		
		// read file
		
		try {
			File f = new File("F:\\JAVA\\files\\"+name+"Sale.txt");
			Scanner fr = new Scanner(f);
			for(int i=0;fr.hasNext();i++) {	
				
				date[i]= fr.next();
				customer[i]= fr.next();
				product[i]= fr.next();
				
				quantity[i]= Double.parseDouble(fr.next());
				rate[i]= Double.parseDouble(fr.next());
				amount[i]= Double.parseDouble(fr.next());
				payment[i]= Double.parseDouble(fr.next());
				lastindex=i+1;
				
				 
			}
			fr.close();
		}catch(IOException e) {
		e.printStackTrace();
		
		}
		
		
		
	}

	public void addSales(String date,String cus,String pro,double quan,double rate,double pay) {
		this.date[lastindex] = date;
		customer[lastindex] = cus;
		product[lastindex] = pro;
		quantity[lastindex] = quan;
		this.rate[lastindex] = rate;
		amount[lastindex] = rate*quan;
		payment[lastindex] = pay;
		lastindex++;
		
		
		
	}

	public void deleteSales(String date,String cus,String pro,double quan,double rate,double pay) {
		int in = 0;
		for(int i =0;i<lastindex;i++) {
			if(this.date[i] == date && customer[i] == cus && product[i] == pro && quantity[i] == quan
					&& this.rate[i] == rate && amount[i] == rate*quan 
					&& payment[i] == pay) {
				in = i;
				}
		}
			if(in>0) {
				for(int a= in ;a<lastindex;a++) {
					this.date[a] = this.date[a+1];
					customer[a] = customer[a+1] ;
					product[a] = product[a+1];
					quantity[a] = quantity[a+1];
					this.rate[a] = this.rate[a+1] ;
					amount[a] = amount[a+1] ;
					payment[a] = payment[a+1] ;
					}
				lastindex--;
				}
		//else
			//System.out.println("Not found!!");
			
	
	}
	
	public void listSales() {
		for(int i=0;i<lastindex;i++) {
			System.out.println(date[i]+" "+customer[i]+" "+
								product[i]+" "+quantity[i]+" "+rate[i]+
								" "+amount[i]+" "+payment[i]);
		}
		
	}
	
	public double totalSales(String cus) {
		double tsale=0;
		for(int i=0;i<lastindex;i++) {
			if(customer[i].equals(cus)) {
				tsale += amount[i];
			}
		}
			return tsale;
		
	}
	
	public double totalPayment(String cus) {
		double tsale=0;
		for(int i=0;i<lastindex;i++) {
			if(customer[i].equals(cus)) {
				tsale += payment[i];
			}
		}
			return tsale;
	}
	
	public void searchCus(String cus) {	
		for(int i=0;i<lastindex;i++) {
			if(customer[i].equals(cus)) {
				System.out.println(date[i]+" "+customer[i]+" "+
						product[i]+" "+quantity[i]+" "+rate[i]+
						" "+amount[i]+" "+payment[i]);
			}
		}
	}
	
	public void searchPro(String pro) {	
		for(int i=0;i<lastindex;i++) {
			if(product[i].equals(pro)) {
				System.out.println(date[i]+" "+customer[i]+" "+
						product[i]+" "+quantity[i]+" "+rate[i]+
						" "+amount[i]+" "+payment[i]);
			}
		}
	}
	
	public double totalPro(String pro) {
		double tsale=0;
		for(int i=0;i<lastindex;i++) {
			if(product[i].equals(pro)) {
				tsale += quantity[i];
			}
		}
			return tsale;
		
	}

	public boolean saveSale() {
		
	
		FileWriter fw;
		try {
			fw = new FileWriter("F:\\JAVA\\files\\"+name+"Sale.txt");
		
		
		for(int i=0;i<lastindex;i++) {
			fw.write(date[i]);
			fw.write(" ");
			fw.write(customer[i]);
			fw.write(" ");
			fw.write(product[i]);
			fw.write(" ");
			fw.write(Double.toString(quantity[i]));
			fw.write(" ");
			fw.write(Double.toString(rate[i]));
			fw.write(" ");
			fw.write(Double.toString(amount[i]));
			fw.write(" ");
			fw.write(Double.toString(payment[i]));
			fw.write("\n");	
		} 
		
		fw.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
			
		
	return true;

	}

	public String[] getCustomer() {
		return customer;
	}

	public String[] getProduct() {
		return product;
	}

	public int getLastindex() {
		return lastindex;
	}
	

}
