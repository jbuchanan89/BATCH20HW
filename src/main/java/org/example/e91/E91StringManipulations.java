package org.example.e91;

import java.sql.SQLOutput;

public class E91StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 'str1' and assign the value "syntax technologies" to it
        String str1 = "syntax technologies";
        // Create a String variable named 'str2' and assign the value "SYNTAX TECHNOLOGIES" to it
        String str2 = "SYNTAX TECHNOLOGIES";
        // Use the toUpperCase() method to convert 'str1' to uppercase and print the result
        str1 = str1.toUpperCase();
        // Use the toLowerCase() method to convert 'str2' to lowercase and print the result
        str2 = str2.toLowerCase();
        System.out.println(str1);
        System.out.println(str2);
    }
}
