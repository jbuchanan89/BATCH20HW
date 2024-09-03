package org.example.e132;

public class E132StaticKeyword {

    static void reduce10(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] - 10 + " ");
        }
    }
    public static void main(String[] args) {
        E132StaticKeyword red = new E132StaticKeyword();
            int [] array = {1,2,3,4};
            red.reduce10(array);

    }}

