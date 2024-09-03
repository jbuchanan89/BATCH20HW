package org.example.e128;

public class E128StaticKeyword {
    static  void mixString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("NOTE: s1 and s2 should be of equal lengths:");
        } else {
            for (int i = 0; i < s1.length(); i++) {
                System.out.print(s1.charAt(i));
                System.out.print(s2.charAt(i));
            }

        }
    }
    public static void main(String[] args) {
        E128StaticKeyword.mixString("12345","abcde");
    }

}