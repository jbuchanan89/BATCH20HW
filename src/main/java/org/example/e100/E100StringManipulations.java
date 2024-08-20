package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        String rev="";

        System.out.println("Enter a string");

        String string = scan.nextLine();
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
    }
}
