package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
        String operator = "*";
        // Declare two variables for numbers and assign values
        int num1 = 10;
        int num2 = 5;
        // Perform the corresponding arithmetic operation
        if (operator == "+") {
            int result = num1 + num2;
            System.out.println(result);
        }else if (operator == "-"){
            int result = num1 - num2;
        }else if (operator == "*") {
            int result = num1 * num2;
            System.out.println(result);
        }else if (operator == "/"){
            int result = num1 / num2;
            System.out.println(result);
        } else {
            System.out.println("Invalid Operator");
        }

    }
}
