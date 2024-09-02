package org.example.e118;

public class E118JavaMethods {

    public static void spaceOut(String a){

        for (int i = 0; i < a.length(); i++){
            System.out.print(a.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        // Students will write the code here.
        spaceOut("Hello");
    }
}
