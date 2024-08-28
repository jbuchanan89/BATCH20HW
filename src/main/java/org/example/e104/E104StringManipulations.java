package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[5];

        System.out.println("Input 5 names");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].substring(0,3));
        }

    }
}


