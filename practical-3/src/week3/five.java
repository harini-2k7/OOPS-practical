package week3;

import java.util.Scanner;
public class five {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	 
	        System.out.print("Enter number of salespersons: ");

	        int salespersons = sc.nextInt();
	 
	        System.out.print("Enter number of months: ");

	        int months = sc.nextInt();
	 
	        double[][] sales = new double[salespersons][months];
	 
	        for (int i = 0; i < salespersons; i++) {

	            System.out.println("Enter sales for Salesperson " + (i + 1) + ":");

	            for (int j = 0; j < months; j++) {

	                System.out.print("Month " + (j + 1) + ": ");

	                sales[i][j] = sc.nextDouble();

	            }

	        }
	 
	        System.out.println("Salesperson\t" + "Monthly Sales\t\t" + "Total\t\t" + "Average\t\t" + "Performance");
	 
	        for (int i = 0; i < salespersons; i++) {

	            double total = 0;

	            System.out.print("Person " + (i + 1) + "\t\t");

	            for (int j = 0; j < months; j++) {

	                System.out.print(sales[i][j] + "\t");

	                total += sales[i][j];

	            }

	            double avg = total / months;

	            String performance;

	            if (avg >= 8000) {

	                performance = "Excellent";

	            } else if (avg >= 5000) {

	                performance = "Good";

	            } else if (avg >= 3000) {

	                performance = "Average";

	            } else {

	                performance = "Poor";

	            }

	            System.out.println("\t" + total + "\t" + avg + "\t" + performance);

	        }
	 
	        sc.close();

	    }

	}

	 

