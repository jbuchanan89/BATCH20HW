package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");

        String enter = scan.nextLine();

        for (int i = 0; i < enter.length(); i++) {

            if (enter.charAt(i) == 'a') {
                System.out.print(enter.charAt(i));
            } else if (enter.charAt(i) == 'e') {
                System.out.print(enter.charAt(i));
            } else if (enter.charAt(i) == 'i'){
                System.out.print(enter.charAt(i));
            } else if(enter.charAt(i) == 'o'){
                System.out.print(enter.charAt(i));
            } else if (enter.charAt(i) =='u') {
                System.out.print(enter.charAt(i));
            }
        }

    }
}


