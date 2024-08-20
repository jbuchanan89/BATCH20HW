package org.example.e85;

public class E85NestedForLoops {
    public static void main(String[] args) {
        // Outer loop controls the number of lines in the upper part of the pattern
        // Use a loop that starts from 1 and goes up to 7 (inclusive)
        // Inside this loop, use another loop that starts from 1 and goes up to the current value of the outer loop
        // Print the current number followed by a space
        // After the inner loop finishes, print a newline character to move to the next line
        for (int i =1; i <= 7; i++){
            // Inside this loop, use another loop that starts from 1 and goes up to the current value of the outer loop
            // Print the current number followed by a space
            for (int j = 1; j <= 7; j++){
                System.out.print(j + " ");
            }
            // After the inner loop finishes, print a newline character to move to the next line
            System.out.println();
        }
        // Outer loop controls the number of lines in the lower part of the pattern
        // Use a loop that starts from 6 and goes down to 1 (inclusive)
        // Inside this loop, use another loop that starts from 1 and goes up to the current value of the outer loop
        // Print the current number followed by a space
        // After the inner loop finishes, print a newline character to move to the next line
    }
}
