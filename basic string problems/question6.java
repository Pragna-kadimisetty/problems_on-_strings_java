// 6. Concatenate two strings
import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Using concat() method
        String result = str1.concat(str2);
        System.out.println("Concatenated string: " + result);
    }
}
