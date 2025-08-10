package week3;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string : ");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder input = new StringBuilder(str);
		if (str.equals(input.reverse().toString()))
		{
			System.out.println("It is palindrome");
		}
		else 
		{
			System.out.println("It is not palindrome");
		}
		sc.close();
	}
}

