package org.example.e64;

import java.util.Scanner;

public class E64ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value for end
        System.out.println("Enter a value for end");
        int end = scanner.nextInt();
        System.out.println("Int: " + end);

        // Use a for loop that starts with i = 0 and continues while i < 2 * end
        int i;
        for(i=0; i < 2 * end; i++){
            System.out.print(i + " ");
        }
        // Inside the loop, print the value of i followed by a space


        // Step 1: Create a Scanner object to read input from the console

    }
}
