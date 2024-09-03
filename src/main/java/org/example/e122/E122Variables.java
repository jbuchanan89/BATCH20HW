package org.example.e122;

public class E122Variables {
    // Declare 3 instance variables: name of the countryName, capital, and populationSize
    private String countryName;
    private String capital;
    private long populationSize;
    // Create a method to display values of instance variables
    void printData(){
        System.out.println("The capital of " + countryName + " is " + capital +  " and population is " + populationSize);
    }

    public E122Variables(String countryName, String capital, long population){
        this.countryName = countryName;
        this.capital = capital;
        this.populationSize = population;
    }
    public static void main(String[] args) {
        // Create 2 instances of the class

        E122Variables country1 = new E122Variables("USA", "Washington,DC", 330000000);
        country1.printData();

        E122Variables country2 = new E122Variables("Kazakhstan", "Astana", 18500000);
        country2.printData();

        // Assign values to variables for the first instance
        // Execute the method to display values for the first instance
        // Assign values to variables for the second instance
        // Execute the method to display values for the second instance
    }
}
