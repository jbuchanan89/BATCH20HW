package org.example.e18;

public class E18ShoppingCartRoundingTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values
        double item1 =35.45;
        double item2 =43.52;
        double item3 =98.99;

        // Calculate total cost
        double totalCost = item1 + item2 + item3;

        // Type cast the double to an int to round it down
        int roundedCost = (int) totalCost;

        // Print the results
        System.out.println(roundedCost);

    }
}
