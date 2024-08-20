package org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Create an array of integers that will store 5 elements

        int numbers[] = new int[5];
        // Use a loop to read 5 integers from the user and store them in the array

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        for (int j = 4; j >= 0; j--){
            System.out.println(numbers[j]);

        }


        // (Do not print any prompt message for the user)

        // Use another loop to iterate through the array 1in reverse order and print each value on a new line

    }
}
