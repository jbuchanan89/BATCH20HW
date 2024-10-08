package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);
        // Prompt the user to input a browser name
        System.out.println("Enter a browser name");

        // Read the input string
        String browser = scan.nextLine().toLowerCase();


        // Use conditional statements to print the message based on the input
        // If the input is "Chrome", "chrome", "CHROME", or "ChRoMe", print "Proceed with Chrome browser"
        // If the input is "firefox", "FIREFOX", or "FireFOX", print "Proceed with Firefox browser"
        // If the input is "IE", "ie", or "iE", print "Proceed with IE browser"
        // For any other input, print "Invalid browser"
        if(browser.equals("chrome")){
            System.out.println("Proceed with Chrome browser");
        }else if (browser.equals(("firefox"))){
            System.out.println("Proceed with Firefox browser");
        }else if (browser.equals("ie")){
            System.out.println("Proceed with IE browser");
        }

    }
}
