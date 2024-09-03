package org.example.e127;

public class E127StaticKeyword {

    // Non-static method that prints a message
    void nonStaticMethod(){
        System.out.println("Programming is amazing.");
    }

    static void staticMethod(){
        System.out.println("Java is awesome.");
    }
    // Static method that prints a message

    // Main method to execute both methods
    public static void main(String[] args) {
        // Create an instance of the class to call the non-static method
        E127StaticKeyword classes = new E127StaticKeyword();
        classes.nonStaticMethod();
        classes.staticMethod();
          // Call non-static method

        // Call the static method directly using the class name
         // Call static method
    }
}
