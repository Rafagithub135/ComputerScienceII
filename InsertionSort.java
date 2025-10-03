public class InsertionSort {
    static void main() {
        int[] a = {25, 32, 155, 17, 8, 455, 12, 13, 132, 13, 45, 678, 1023, 1, 999, 582, 1507, 3593, 190, 76};
        insertionSort(a);
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int sortValue = a[i];
            for(int j = i - 1; j >= 0; j--) {
                if(sortValue <= a[j]) {
                    int temp = a[j];
                    a[j + 1] = temp;
                    a[j] = sortValue;
                } else {
                    break;
                }
            }
        }
    }
}