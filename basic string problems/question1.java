// 1. Find the Length of a string 
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Using length() method to find string length
        int length = str.length();
        System.out.println("Length of the string: " + length);
    }
}
