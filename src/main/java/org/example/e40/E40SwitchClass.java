package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to enter the name of the instructor
        System.out.println("Enter name of the instructor");
        // Capture the instructor name input
        String instructorName = scanner.nextLine();
        // Determine the responsibility based on the instructor's name using a switch statement
        switch (instructorName) {
            // If the name is "Asghar"
            //    Set responsibility to "Will take care of Java Assignment"
            case "Ashgar":
                System.out.println("Will take care of Java Assignment");
                break;
            // If the name is "Moazzam"
            //    Set responsibility to "Will take care of SDLC Assignment"
            case "Moazzam":
                System.out.println("Will take care of SDLC Assignment");
                break;
            // If the name is "Weqas"
            //    Set responsibility to "Will take care of Selenium Assignment"
            case "Weqas":
                System.out.println("Will take care of Selenium Assignment");
                break;
            // If the name is "Asel"
            //    Set responsibility to "Will take care of every Assignment"
            // For any other name
            case "Asel":
                System.out.println("Will take care of every Assignment");
                break;

            //    Set responsibility to "Invalid instructor selected"
            default:
                System.out.println("Invalid instructor selected");
                break;
        }
        // Print the responsibility
    }
}
