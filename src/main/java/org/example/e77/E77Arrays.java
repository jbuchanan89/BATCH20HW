package org.example.e77;

public class E77Arrays {
    public static void main(String[] args) {
        // Declare and initialize the array with the given values
        int[] numbers = {5, 4, 8};

        // Use a loop to iterate through the array and find the highest value
        int max=numbers[0];
            for(int j=0; j < 3; j++){
                if(numbers[j]>  max) {
                    max = numbers[j];
                }
        }
        System.out.println(max);
        // Print the highest value found in the array
    }
}
