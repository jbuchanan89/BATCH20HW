package org.example.e133;

public class E133StaticKeyword {

    static void countA(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A'){
                counter = counter + 1;
            }

        }
        System.out.println(counter);
    }
    public static void main(String[] args) {
        E133StaticKeyword ctA = new E133StaticKeyword();
        ctA.countA("Amanada");
    }
}

