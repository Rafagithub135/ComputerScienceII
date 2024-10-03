package Lesson4.Palindrome;

import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String candidate) {
        if (candidate.length() == 0 || candidate.length() == 1) {
            return true;
        } else {
            if (candidate.charAt(0) == candidate.charAt(candidate.length() - 1)) {
                return isPalindrome(candidate.substring(1, candidate.length() - 1));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter a word to test if it is a palindrome.");
        System.out.print("Enter the word: ");
        String s1 = kbInput.nextLine();
        System.out.println(isPalindrome(s1));
    }
}