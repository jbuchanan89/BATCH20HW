package org.example.e119;

public class E119JavaMethods {

    public static void censorLetter(String word, char a){
        String word2 = word.replace(a, '*');
        System.out.println(word2);
    }
    public static void main(String[] args) {
        // Students will write the code here.

        censorLetter("Science ", 'e');
    }

}
