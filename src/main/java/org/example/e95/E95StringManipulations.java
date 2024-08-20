package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a string value
        System.out.println("Enter a string value");

        // Read the input string
        String value = scan.nextLine();

        // Extract the first 3 letters using the substring() method
        System.out.println(value.substring(0,3));


        // Print the result in the specified format
    }
}
