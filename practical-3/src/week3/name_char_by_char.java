package week3;
import java.util.Scanner;
public class name_char_by_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name : ");
		String s1= sc.nextLine();
		for (int i = 0; i < s1.length(); i++) {
            System.out.println("Character at " + i + " is: " + s1.charAt(i));
		}
		sc.close();
	}

}
