package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char

public static class printChar{
    int number;
    double doubleNumber;
    char c;

    void printInfo(){
        System.out.println(number);
        System.out.println(doubleNumber);
        System.out.println(c);
    }
}


    public static void main(String[] args) {
        // Create 2 instances of the class

        printChar pc = new printChar();
        pc.number = 3;
        pc.doubleNumber = 55.5;
        pc.c = 'J';

        pc.printInfo();

        printChar pc2 = new printChar();
        pc2.number= 5;
        pc2.doubleNumber = 100.78;
        pc2.c = 'B';

        pc2.printInfo();
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance
    }
}
