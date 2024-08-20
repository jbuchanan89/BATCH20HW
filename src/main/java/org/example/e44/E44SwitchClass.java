package org.example.e44;
import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        // Capture the meal type input
        int mealType = scanner.nextInt();
        // Calculate price using switch statement
        switch(mealType){
            case 1:
                System.out.println(mealType);
                System.out.println("Breakfast costs $5.00.");
                break;

            case 2:
                System.out.println(mealType);
                System.out.println("Lunch costs $10.00.");
                break;
            case 3:
                System.out.println(mealType);
                System.out.println("Dinner costs $15.00.");
                break;

            default:
                System.out.println(mealType);
                System.out.println("Invalid meal type entered");
        }
        // Case 1
        //    Set price to $5.00
        // Case 2
        //    Set price to $10.00
        // Case 3
        //    Set price to $15.00
        // Default
        //    Print "Invalid meal type entered"

        // Print the price
        // Output: The price of your meal is $____
    }
}
