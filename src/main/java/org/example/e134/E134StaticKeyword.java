package org.example.e134;

public class E134StaticKeyword {

    static void countVowels(String s){
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a'){
                counter = counter + 1;
            } else if (s.charAt(i) == 'e'){
                counter = counter + 1;
            } else if (s.charAt(i) == 'i'){
                counter = counter + 1;
            } else if (s.charAt(i) == 'o'){
                counter = counter + 1;
            } else if (s.charAt(i) == 'u'){
                counter = counter + 1;
            }
        }
        System.out.println(counter);
    }
    public static void main(String[] args) {
    E134StaticKeyword vo = new E134StaticKeyword();

    vo.countVowels("areioufdfdf");
    }
}

