// 5. Check if a string contains a word 
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a word to check: ");
        String word = sc.nextLine();

        // contains() method checks if word exists in string
        if(str.contains(word)) {
            System.out.println("The string contains the word.");
        } else {
            System.out.println("The string does not contain the word.");
        }
    }
}
