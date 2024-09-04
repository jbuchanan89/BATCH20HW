package org.example.e137;

public class E137AccessModifiers {

    static void schoolInformation(String name, String city, String schoolName, int batchNumber){
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + schoolName + " in batch " + batchNumber);
    }
    public static void main(String[] args) {
        String name;
        String city;
        String schoolName;
        int batchNumber;

        E137AccessModifiers schoolInfo = new E137AccessModifiers();
        schoolInfo.schoolInformation("Jennifer", "Falls Church", "Syntax", 20);
    }
}

