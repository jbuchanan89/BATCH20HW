package org.example.e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Print a string");
    String ent = s.nextLine();
        System.out.println("In " + ent);
        System.out.println("In: " + ent);
        for (int i = 0; i < ent.length(); i++) {
            System.out.println(ent.charAt(i));
        }

    }
}
