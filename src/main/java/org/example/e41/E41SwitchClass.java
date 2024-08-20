package org.example.e41;
import java.util.Scanner;

public class E41SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to enter the time of day
        System.out.println("Enter the time of day (morning, afternoon, evening, night)");
        // Capture the time of day input
        String timeOfDay = scanner.nextLine();
        // Recommend meal using switch statement
        switch(timeOfDay){
            // Case "morning"
            //    Print "Recommended meal: Breakfast"
            case "morning":
                System.out.println(timeOfDay);
                System.out.println("Recommended meal: Breakfast");
                break;
            case "afternoon":
                System.out.println(timeOfDay);
                System.out.println("Recommended meal: Lunch");
                break;

            case "evening":
                System.out.println(timeOfDay);
                System.out.println("Recommended meal: Dinner");
                break;
            case "night":
                System.out.println(timeOfDay);
                System.out.println("Recommended meal: Snack");
                break;

            default:
                System.out.println(timeOfDay);
                System.out.println("Invalid time of day entered");

        }





    }
}
