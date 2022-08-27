import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Product {

	private String[] name;
	private double[] totalSold;
	private double[] totalPurchase;
	private double[] balance;
	private int index;
	
	public Product(String namee) {
		
		Sales s = new Sales(namee);
		Purchase p = new Purchase(namee);
		
		
		this.name = new String[999999];
		totalSold = new double[999999];
		totalPurchase = new double[999999];
		balance = new double[999999];
		index = s.getLastindex();
		
		try {
			File f = new File("F:\\JAVA\\files\\"+namee+"Details.txt");
			Scanner fr = new Scanner(f);
			for(int i=0;fr.hasNext();i++) {	
				
				fr.next();
				name[i]= fr.next();
				fr.next();
				
				 
			}
			fr.close();
		}catch(IOException e) {
		e.printStackTrace();
		
		}
		
		
		for(int i=0;i<index;i++) {
			totalSold[i] = s.totalPro(name[i]);
			totalPurchase[i] = p.totalPro(name[i]);
			balance[i] = totalPurchase[i] - totalSold[i];
		}
		
	}


	public String[] getName() {
		return name;
	}


	public double[] getTotalSold() {
		return totalSold;
	}


	public double[] getTotalPurchase() {
		return totalPurchase;
	}


	public double[] getBalance() {
		return balance;
	}
	
	
	
	
	
}

	
	

