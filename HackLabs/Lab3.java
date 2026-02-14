package HackLabs;

import java.util.Scanner;

/**
 * This program will demonstrate exception handling.
 *
 * See the "run" method for instructions.
 */
public class Lab3 {

    /**
     * Used in the three methods for getting keyboard input.
     */
    Scanner keyboard;

    /**
     * Used in a method for retrieving array data.
     */
    int[] arr = {4, 8, 15, 16, 23, 42};

    /**
     * Used in a method for retrieving string characters.
     */
    String str;

    /**
     * Constructor.
     */
    public Lab3() {
        keyboard = new Scanner(System.in);
        str = "CSCI 112";
    }

    /**
     * Run Method.
     * <p>
     * Each function below performs a different task.
     * <p>
     * Check the comment/description of each method and add the necessary
     * exception handling to each method.
     * <p>
     * DO NOT use the generic Exception object type in any of these methods.
     */
    private void run() {
//        handlingTest1();
        handlingTest2();
//        handlingTest3();
    }

    /**
     * Main Method.
     *
     * @param args - Command line arguments (not used)
     */
    public static void main(String[] args) {
        Lab3 obj = new Lab3();
        obj.run();
    }

    /**
     * This method prompts the user to enter a non-negative number.
     * <p>
     * Add exception handling inside this method to handle the following situations:
     * The user enters a non-integer (like 1.23)
     * The user enters a string (like "abcd")
     * <p>
     * Upon handling these situations, ensure that the program can continue to prompt for valid input.
     * Display an appropriate error message similar to what is displayed when a user enters a negative number.
     */
    private void handlingTest1() {
        int userNumber = -1;
        while (userNumber < 0) {
            try {
                System.out.println("Enter a number: ");
                userNumber = Integer.parseInt(keyboard.nextLine());
                if (userNumber < 0) {
                    System.out.println("Error. Number must not be negative.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error. Number must be a positive integer.");
            }
        }
        System.out.println("You entered " + userNumber + ".");
    }


    /**
     * This method prompts the user to enter an index of an array and displays the
     * value stored at that index.
     * <p>
     * Add exception handling inside this method to handle the following situations:
     * The user enters a non-integer (like 1.23)
     * The user enters a string (like "abcd")
     * The user enters an index that is beyond the end of the array
     * <p>
     * Upon handling these situations, ensure that the program can continue to prompt for valid input.
     * Display an appropriate error message similar to what is displayed when a user enters a negative index.
     */
    private void handlingTest2() {
        int index = -1;
        while (index < 0) {
            try {
                System.out.println("Enter an array index: ");
                index = Integer.parseInt(keyboard.nextLine());
                if (index < 0) {
                    System.out.println("Error. Index must not be negative.");
                    continue;
                } else if (index > arr.length - 1) {
                    System.out.println("Error. Index must be less than the size of the array.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error. Index must be an integer.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error. Index 2 is out of bounds.");
            }
        }
        System.out.println("The value at index " + index + " is " + arr[index]);
    }
}

    /**
     * This method prompts the user to enter an index of a string and displays the
     * character at that index.
     *
     * Add exception handling inside this method to handle the following situations:
     * The user enters a non-integer (like 1.23)
     * The user enters a string (like "abcd")
     * The user enters an index that is beyond the end of the string
     *
     * Upon handling these situations, ensure that the program can continue to prompt for valid input.
     * Display an appropriate error message similar to what is displayed when a user enters a negative index.
     */
//    private void handlingTest3() {
//        int index = -1;
//        while(index < 0) {
//            try {
//                System.out.println("Enter a string character index: ");
//                index = Integer.parseInt(keyboard.nextLine());
//                if (index < 0) {
//                    System.out.println("Error. Index must not be negative.");
//                    continue;
//                }
//                System.out.println("The character at index " + index + " is " + str.charAt(index));
//            } catch(NumberFormatException e){
//                System.out.println("Error. Index must be an integer.");
//            } catch(IndexOutOfBoundsException e){
//                System.out.println("Error. Index 3 is out of bounds.");
//            }
//        }
//    }
//}