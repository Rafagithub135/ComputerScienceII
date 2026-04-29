package HackLabs.SortTimes;

import java.util.Random;

public class Times {
    public static void main(String[] args) {
        // Creates a variable to store the current date.
        String date = "The start date is:  " + java.time.LocalDate.now();
        // Creates a variable to store the current time at the beginning of the sort.
        String startTime = "" + java.time.LocalTime.now();
        // Prints the date of the sort.
        System.out.println(date);
        // Prints the time the sort begins.
        System.out.println("The start time is:  " + startTime);
        // Creates an array of integers.  The number of integers is the number inside the square brackets.
        int[] numbers = new int[20];
        // Fills the array with random numbers between 1 and the number inside the parentheses after the r.nextInt() method.
        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(100) + 1;
        }
        // Prints the unsorted array
        System.out.println("Unsorted Array:");
        printArray(numbers);
        // Calls the bubbleSort method.
        bubbleSort(numbers);
        // Prints the sorted array
        System.out.println("Sorted Array:");
        printArray(numbers);
        // Creates a variable to store the current date at the end of the sort.
        String endDate = "The end date is:  " + java.time.LocalDate.now();
        System.out.println(endDate);
        // Creates a variable to store the current time at the end of the sort.
        String endTime = "" + java.time.LocalTime.now();
        // Prints the time the sort ends.
        System.out.println("The end time is:  " + endTime);
        // Subtracts the start time from the end time to get the time it took to run the sort.
        System.out.println("The time to run this sort is:  " + endTime.compareTo(startTime) + " milliseconds.");
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}