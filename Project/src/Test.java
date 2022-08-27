
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Purchase s1 =new Purchase("maher");
		///s1.addSales("1/1/22", "maher", "fiberchina", 30, 10,300);
		//s1.addSales("2/1/22", "aaa", "fiber", 10, 10,50);
		//s1.addSales("3/1/22", "aaa", "fiber", 40, 10,400);
		//s1.addSales("4/1/22", "maher", "fiberchina", 20, 10,100);
		
		//s1.addSales("5/1/22", "maher", "fiber", 10, 10,100);
		
		//String[] s =  s1.getName();
		double t = s1.totalPurchase("maher");
		double t2 = s1.totalPayment("maher");
		
		
		//for(int i = 0;i<9;i++) {
		//System.out.println(s[i]);
		System.out.println(t);
		System.out.println(t2);
		//System.out.println(s[1]);
		//System.out.println(s[2]);
		//System.out.println(s[3]);
		//s1.searchCus("aaa");
		//System.out.println(s1.totalSales("maher"));
		//s1.searchPro("fiber");
		
		//login("maher","2132077");
		//}
		System.out.println("Accounting Software Package");
		
	//	System.out.println(s1.saveSale());
		
	}
	
	
	
	
	public static boolean login(String aname,String passa ) {
		
		String[] name = new String[100];
		String[] pass = new String[100];
		String[] dateob = new String[100];
		String[] email = new String[100];
		String[] mob = new String[100];
		String[] gender = new String[100];
		boolean a = false;
		int ab=1;
		
		
		try {
			File f = new File("F:\\JAVA\\files\\registration.txt");
			Scanner fr = new Scanner(f);
			for(int i=0;fr.hasNext();i++) {	
				
				name[i]= fr.next();
				pass[i]= fr.next();
				dateob[i]= fr.next();
				email[i]= fr.next();
				mob[i]= fr.next();
				gender[i]= fr.next();
				 ab =i;
				 
			}
			fr.close();
		}catch(IOException e) {
		e.printStackTrace();
		return false;
		}
		
		for(int i=0;i<= ab ;i++) {
			if(aname.equals(name[i]) && passa.equals(pass[i])) {
				 a = true;
			}
		}
		if(a) {
			return true;
		
		//menu();
		}
		else
			return false;
			
		
	}
	
	
	public static boolean register(String aname,String passa,String dateoba,String emaila,String moba,String gendera ) {
		
		int a=0;
		String[] name = new String[100];
		String[] pass = new String[100];
		String[] dateob = new String[100];
		String[] email = new String[100];
		String[] mob = new String[100];
		String[] gender = new String[100];
		
		
		try {
			File f = new File("F:\\JAVA\\files\\registration.txt");
			Scanner fr = new Scanner(f);
			for(int i=0;fr.hasNext();i++) {	
				name[i]= fr.next();
				pass[i]= fr.next();
				dateob[i]= fr.next();
				email[i]= fr.next();
				mob[i]= fr.next();
				gender[i]= fr.next();
				 a =i;
				 
			}
			fr.close();
		}catch(IOException e) {
		e.printStackTrace();
		return false;
		}
		
		
		try {
			
			FileWriter fw = new FileWriter("F:\\JAVA\\files\\registration.txt");
			
			for(int i=0;i<=a;i++) {
				fw.write(name[i]);
				fw.write(" ");
				fw.write(pass[i]);
				fw.write(" ");
				fw.write(dateob[i]);
				fw.write(" ");
				fw.write(email[i]);
				fw.write(" ");
				fw.write(mob[i]);
				fw.write(" ");
				fw.write(gender[i]);
				fw.write("\n");
			}
			fw.write(aname);
			fw.write(" ");
			fw.write(passa);
			fw.write(" ");
			fw.write(dateoba);
			fw.write(" ");
			fw.write(emaila);
			fw.write(" ");
			fw.write(moba);
			fw.write(" ");
			fw.write(gendera);
			fw.close();
			
		}catch(IOException e) {
		e.printStackTrace();	
		return false;
		}
		return true;
	
	}
	
	public static void menu() {
		System.out.println("\n");
		System.out.println("                    ***Accounting Software Package***");
		
		
	}
	
	
	
}