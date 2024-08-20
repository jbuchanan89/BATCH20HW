package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        float morningExpense = 54.55f;
        float afternoonExpense = 76.54f;
        float eveningExpense = 17.55f;

        // Calculate total expense
        float totalExpense = morningExpense + afternoonExpense + eveningExpense;

        // Define a budget
        float budget = 150;

        // Check if within budget
        if(totalExpense < budget) {
            System.out.println("Your total daily expense is: " + totalExpense);
            System.out.println("You are within budget");
        } else {
            System.out.println("Your total daily expense is: " + totalExpense);
            System.out.println("You are not within the budget.");
        }

    }
}
