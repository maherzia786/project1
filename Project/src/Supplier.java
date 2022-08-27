import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Supplier {

	private String[] name;
	private double[] totalamount;
	private double[] totalpayment;
	private double[] balance;
	private int index;

	
	public Supplier(String namee) {
		Purchase s = new Purchase(namee);
			
		this.name = new String[999999];
		totalamount = new double[999999];
		totalpayment = new double[999999];
		balance = new double[999999];
		index = s.getLastindex();
		
		try {
			File f = new File("F:\\JAVA\\files\\"+namee+"Details.txt");
			Scanner fr = new Scanner(f);
			for(int i=0;fr.hasNext();i++) {	
				fr.next();
				fr.next();
				name[i]= fr.next();
				
				
				 
			}
			fr.close();
		}catch(IOException e) {
		e.printStackTrace();
		
		}
		
		
		for(int i=0;i<index;i++) {
			totalamount[i] = s.totalPurchase(name[i]);
			totalpayment[i] = s.totalPayment(name[i]);
			balance[i] = totalamount[i] - totalpayment[i];
		}
		
	}


	public String[] getName() {
		return name;
	}


	public double[] getTotalamount() {
		return totalamount;
	}


	public double[] getTotalpayment() {
		return totalpayment;
	}


	public double[] getBalance() {
		return balance;
	}
	
	
	
	
}
