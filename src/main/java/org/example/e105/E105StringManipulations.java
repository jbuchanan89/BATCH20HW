package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");

        String enter = scan.nextLine();

        for (int i = 0; i < enter.length(); i++) {
            System.out.print(enter.charAt(i));
            }
        }

    }

