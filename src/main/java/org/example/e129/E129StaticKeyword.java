package org.example.e129;

import org.example.e128.E128StaticKeyword;

public class E129StaticKeyword {

    static String countryName = "Morocco";
    static String continent = "Africa";

    public void displayInfo(){
        System.out.println(countryName + " located on " + continent);
    }
    public static void main(String[] args) {
        E129StaticKeyword country = new E129StaticKeyword();

        country.displayInfo();
    }
}
