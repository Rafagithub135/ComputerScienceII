package HackLabs.Module11.SampleCode;

import java.util.Scanner;

/**
 * Demonstrates the Jump Search algorithm.
 */
public class JumpSearch {

    /**
     * Main Method.
     * @param args - Command line arguments.
     */
    public static void main(String[] args) {
        int[] numbers = {3, 7, 9, 15, 18, 24, 31, 45, 67, 82};

        //Prints the array
        printArray(numbers);

        Scanner kb = new Scanner(System.in);

        while(true) {
            //Prompt for number to search for.
            System.out.print("Enter a number to search for (-1 to exit): ");
            int searchVal = kb.nextInt();
            if (searchVal < 0) {
                break;
            }

            //Search the array.
            int foundIndex = jumpSearch(numbers, searchVal);

            //Result of search.
            if(foundIndex == -1) {
                System.out.println("Value was not found in the array.\n");
            }
            else {
                System.out.println("Value was found at index " + foundIndex + "\n");
            }
        }

        kb.close();

    }

    /**
     * Performs a jump search.
     * @param a - The array to search.
     * @param v - The value to search for.
     * @return Index where the value was found. Returning -1 indicates it was not found.
     */
    public static int jumpSearch(int[] a, int v) {
        int previous = 0;
        int jump = (int) Math.sqrt(a.length);
        while(a[(jump < a.length ? jump : a.length-1)-1] < v) {
            previous = jump;
            jump += jump;
            if(jump >= a.length) {
                break;
            }
        }
        while(a[previous] < v) {
            previous += 1;
            if(previous == (jump < a.length ? jump : a.length)) {
                return -1;
            }
        }
        return a[previous] == v ? previous : -1;
    }

    /**
     * Prints the contents of an array of integers.
     * @param a - Array to print.
     */
    public static void printArray(int[] a) {
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}