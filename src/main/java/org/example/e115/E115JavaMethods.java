package org.example.e115;

public class E115JavaMethods {

    public static void convertToUpper(String s){
        s = s.toUpperCase();
        System.out.println(s);
    }
    public static void main(String[] args) {
        // Call the convertToUpper method and print the result
        convertToUpper("jupiter");
    }

    // Create method convertToUpper with a string parameter
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string
}
