package week3;
import java.util.Scanner;
public class number_of_vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine().toLowerCase(); // convert to lowercase for easy comparison
        
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        
        System.out.println("The number of vowels in the string are: " + count);
        sc.close();
		

	}

}
