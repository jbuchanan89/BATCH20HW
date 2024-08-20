package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to enter their mark
        System.out.println("Please enter your mark");
        // Capture the mark input
        int marks = scanner.nextInt();
        // Determine the grade based on the mark
        // If marks are between 1 and 25 (inclusive)
        //    Set grade to "F"
        if (marks >= 1 && marks < 25) {
            char grade = 'F';
            System.out.println("Your grade is " + grade);
        } else if (marks >= 26 && marks < 45) {
            char grade = 'E';
            System.out.println("Your grade is " + grade);
        } else if (marks >= 46 && marks < 50) {
            char grade = 'D';
            System.out.println("Your grade is " + grade);
        } else if (marks >= 51 && marks < 60) {
            char grade = 'C';
            System.out.println("Your grade is " + grade);
        } else if (marks >= 61 && marks < 80) {
            char grade = 'B';
            System.out.println("Your grade is " + grade);
        } else if (marks > 80 && marks < 100) {
            char grade = 'A';
            System.out.println("Your grade is " + grade);
        } else {
            System.out.println("Please enter valid mark");
        }
        // If marks are between 26 and 45 (inclusive)
        //    Set grade to "E"
        // If marks are between 46 and 50 (inclusive)
        //    Set grade to "D"
        // If marks are between 51 and 60 (inclusive)
        //    Set grade to "C"
        // If marks are between 61 and 80 (inclusive)
        //    Set grade to "B"
        // If marks are above 80
        //    Set grade to "A"
        // If marks are not within the valid range (0-100)
        //    Print "Please enter valid mark"

        // Print the grade
        // Output: Your grade is ____
    }
}
