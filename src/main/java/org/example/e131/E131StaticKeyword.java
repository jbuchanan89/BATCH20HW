package org.example.e131;


public class E131StaticKeyword {
    public void thirdLetter (String s){
        for (int i = 0; i < s.length(); i+=3) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }


    public static void main(String[] args) {
        E131StaticKeyword m = new E131StaticKeyword();
        m.thirdLetter("hello there");
        m.thirdLetter("technology");
    }
}
