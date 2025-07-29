package week1;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		double bill;
		double discount;
		double gst = 0.05;
		double maintain = 100;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill");
		bill=sc.nextDouble(); 
		System.out.println("Total bill to pay =" + bill);
		if(bill>=1000) {
			discount = (bill * 0.1);
			bill=bill- discount;
			gst = gst*bill;
			bill=gst+bill+maintain;
			System.out.println("gst =" + gst);
			System.out.println("maintenance =" + maintain);
			System.out.println("total bill to pay with 10% discount  =" + bill);
			}
		else {
			discount = (bill *0.05);
			System.out.println("Total bill to pay = " + bill);
			bill=bill-discount;
			gst = gst*bill;
			bill=gst+bill+maintain;
			System.out.println("gst =" + gst);
			System.out.println("maintenance =" + maintain);
			System.out.println("total bill to pay with 5% discount  =" + bill);
		}
		sc.close();
	}

}

