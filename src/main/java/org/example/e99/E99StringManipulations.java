package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("input a string");

        // Read the input string
        String str = scanner.nextLine();

        // Remove all spaces and convert the string to lowercase
        str = str.replaceAll(" ", "").toLowerCase();

        // Check if the string is a palindrome
        StringBuilder str2 = new StringBuilder();

        str2.append(str);
        str2.reverse();

        if(str.equals(str2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        // Print "true" if the string is a palindrome, and "false" otherwise


        // Step 2: Create a Scanner object to read input from the console


    }
}
