package org.example.e35;
import java.util.Scanner;
public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to answer if they need a loan
        System.out.println("Do you need a loan? (true/false)");
        // Capture the loan requirement input
        boolean needsLoan = scanner.nextBoolean();
        // Check if the user needs a loan
        // If the user needs a loan
        //    Print prompt for user to enter their credit score
        if(needsLoan){
            System.out.println("What is your credit score?");
        } else {
            System.out.println("The elgibility is Unknown");
        }
        //    Capture the credit score input
        int creditScore = scanner.nextInt();
        //    Determine eligibility based on credit score
        //        If credit score is below 600, eligibility = "Not eligible"
        if(creditScore >= 600 && creditScore < 700){
            System.out.println("The elgibility is Maybe elgible");
        } else if(creditScore >= 701 && creditScore <= 800) {
            System.out.println("The elgibility is Elgible");
        } else if(creditScore > 800){
            System.out.println("The elgibility is Definitley Elgible");
        } else{
            System.out.println("The elgibility is Unknown");
        }

        //        If credit score is between 600 and 700 inclusive, eligibility = "Maybe eligible"
        //        If credit score is between 701 and 800 inclusive, eligibility = "Eligible"
        //        If credit score is higher than 800, eligibility = "Definitely eligible"
        // If the user does not need a loan, eligibility = "Unknown"

        // Print the eligibility status
    }
}
