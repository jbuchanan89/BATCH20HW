package org.example.e135;

public class E135StaticKeyword {
    static void surround(String s, char search_term){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == search_term){
                System.out.print("(" + s.charAt(i) + ")");
            }else {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }
  
    public static void main(String[] args) {
        E135StaticKeyword surr = new E135StaticKeyword();
        surr.surround("Hello", 'o');
        surr.surround("technology", 'c');

    }
}

