// 4. Count words in a string 
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Split string by spaces
        String[] words = str.trim().split("\\s+");
        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);
    }
}

