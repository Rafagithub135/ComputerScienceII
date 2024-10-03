package Lesson5;

import java.util.Random;

public class FindItem {

    public static void main(String[] args) {
        Random r = new Random();
        int[] values = new int[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = r.nextInt(100);
        }

        int max = findMax(values);
        System.out.println(String.format("The max is %d", max));

        int targetIndex = findIndexOfValue(values, 10);
        System.out.println(String.format("The value was found at index %d", targetIndex));
    }

    public static int findMax(int[] values) {
        int currentMax = values[0];
        for (int value : values) {
            if (value > currentMax) {
                currentMax = value;
            }
        }
        return currentMax;
    }

    public static int findIndexOfValue(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }
}