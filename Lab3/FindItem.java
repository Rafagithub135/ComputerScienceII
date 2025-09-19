package Lab3;

import java.util.Random;

public class FindItem {
    public static void main(String[] args) {
        Random r = new Random();
        int[] terms = new int[10];
        for (int i = 0; i < terms.length; i++) {
            terms[i] = r.nextInt(100);
        }
    }
}