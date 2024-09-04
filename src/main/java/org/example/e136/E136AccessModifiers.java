package org.example.e136;

public class E136AccessModifiers {

        private static void privateMethod(){
            System.out.println("This is a private method");
        }

        static void defaultMethod(){
            System.out.println("This is a default method");
        }

        protected void protectedMethod(){
            System.out.println("This is a protected method");
        }

        public static void publicMethod(){
            System.out.println("This is a public method");
        }

    public static void main(String[] args) {
        E136AccessModifiers prints = new E136AccessModifiers();

        prints.privateMethod();
        prints.defaultMethod();
        prints.protectedMethod();
        prints.publicMethod();
    }
}


