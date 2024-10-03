package Lesson2.DemoStringObjects;

import java.util.Scanner;

public class DemoStringObjects {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        String greeting = "Hello";
        String testValue = "Hello";

        System.out.println("Type 'Hello' to test strings.");
        String userInput = kbInput.nextLine();

        // True because of compiler optimization.
        System.out.println(greeting == testValue);

        // False because the objects are not the same.
        System.out.println(greeting == userInput);

        // Proper test for string equality.
        System.out.println(greeting.equals(testValue));
    }
}