package week2;

import java.util.Scanner;

public class mix_max_inarray {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the size of the array : ");
			int size = sc.nextInt(); 
			int [] arr = new int[size];
			System.out.println("Enter " + size + " values:");
			for (int i = 0; i < size; i++)
			{
	            arr[i] = sc.nextInt();    
	        }
			int min = arr[0];
			int max = arr[0];
			for(int j=1; j<size; j++) 
			{
				if (arr[j]>max)
				    max=arr[j];
			}
			for(int j=1; j<size; j++)
			{
				if (arr[j]<min)
					min=arr[j];
			}
			System.out.println("minimum array is : " + min);
			System.out.println("maximum array is : " + max);
			
		sc.close();	
	}

}
