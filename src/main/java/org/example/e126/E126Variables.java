package org.example.e126;

import org.example.e123.E123Variables;

public class E126Variables {
    // Declare a static variable at the class level to hold the count of all instances of the class
    private int instanceCount = 0;

    // Constructor to increment the count
    public E126Variables(){
    }

    public void counter(){
        instanceCount = instanceCount + 1;
    }
    public static void main(String[] args) {
        // Create 3 objects of the class
        E126Variables object1 = new E126Variables();
        object1.counter();
        E126Variables object2 = new E126Variables();
        object2.counter();
        // Print the value of the count variable

    }
}
