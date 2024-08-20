package org.example.e63;
import java.util.Scanner;

public class E63ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
    Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value for x
        System.out.println("Enter a Value for x");
        int x = scanner.nextInt();
        System.out.println("In: " + x);

        // Use a for loop that starts with i = 0 and continues while i < x
        int i;
        for(i=0; i < x; i++){
            // Inside the loop, print the value of i followed by a space
            System.out.print(i + " ");

        }
    }
}
