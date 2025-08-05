package week2;

import java.util.Scanner;

public class two_string_equals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter another string: ");
        Scanner sc1 = new Scanner(System.in);
        String s2 = sc1.nextLine();
        System.out.println("Using equals(): " + s1.equals(s2));
		System.out.println("Using ==      : " + (s1 == s2));
        sc1.close();
        sc.close();
        
	}

}


