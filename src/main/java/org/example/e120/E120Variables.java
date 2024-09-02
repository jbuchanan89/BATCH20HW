package org.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number
    int year;
    String schoolName;
    int batchNumber;
    public static void printInfo(int year, String schoolName, int batchNumber){
        System.out.println("I am a student of batch " + batchNumber + " studying at " +  schoolName + " in the year of " +  year);
    }
    public static void main(String[] args) {
        // Access variables from the main method and assign specific values to
        printInfo(2024,"Syntax",20);


        // Print values of your variables in the specified format
    }

}
