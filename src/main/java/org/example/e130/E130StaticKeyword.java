package org.example.e130;

public class E130StaticKeyword {

    public void mystery(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] / 2 + " ");
            } else {
                System.out.println(arr[i] * 10 + " ");
            }
        }
    }
    public static void main(String[] args) {
        E130StaticKeyword newArray = new E130StaticKeyword();
        int[] array = {10,20,4,6,7};
        newArray.mystery(array);
    }
}
