package Lesson5;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] values = new int[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = r.nextInt(100);
        }

        for (int value : values) {
            System.out.print(value + ", ");
        }

        selectionSort(values);
        System.out.println("");
        for (int value : values) {
            System.out.print(value + ", ");
        }
    }

    public static void selectionSort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int minIndex = findIndexOfMinFromIndex(values, i);
            swapValuesAtIndexes(values, i, minIndex);
        }
    }

    public static int findIndexOfMinFromIndex(int[] values, int startIndex) {
        int currentMin = values[startIndex];
        int currentMinIndex = startIndex;

        for (int i = startIndex; i < values.length; i++) {

            if (values[i] < currentMin) {
                currentMin = values[i];
                currentMinIndex = i;
            }
        }
        return currentMinIndex;
    }

    public static void swapValuesAtIndexes(int[] values, int first, int second) {
        int temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }
}