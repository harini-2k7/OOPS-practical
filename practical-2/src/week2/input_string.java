package week2;

import java.util.Scanner;
public class input_string {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        System.out.println("user input string is: " + input);
	        System.out.println("chatacter at position 2: " + input.charAt(2));
	        System.out.println("user input in uppercase is: " + input.toUpperCase());
	        System.out.println("user input in lowercase is: " + input.toLowerCase());
	        System.out.println("user input contains: " + input.contains("java"));
	        System.out.println("user input is replaced a with @: " + input.replace('a', '@'));
	        System.out.println("user input length is: " + input.length());
	        System.out.println("user input substring is: " + input.substring(0,2));
	        sc.close();  
	}

}
