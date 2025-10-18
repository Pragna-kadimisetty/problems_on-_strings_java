// 2. Convert string to Uppercase, lowercase 
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to uppercase
        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // Convert to lowercase
        String lower = str.toLowerCase();
        System.out.println("Lowercase: " + lower);
    }
}

