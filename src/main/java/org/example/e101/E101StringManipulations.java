package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a string");
        String ent = s.nextLine();
        for (int i = 0; i < ent.length(); i=i+2) {
            System.out.print(ent.charAt(i));
        }

        }
    }

