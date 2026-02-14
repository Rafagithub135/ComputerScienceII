public class binarySearch {
    //    array must be sorted first!!!
    static void main() {
        int[] a = {25, 32, 155, 17, 8, 455, 12, 13, 132, 13, 45, 678, 1023};
        System.out.println(binarySearch(a, 455));
        System.out.println(binarySearch(a, 13));
    }

    public static int binarySearch(int[] a, int searchValue) {
        int low = 0;
        int high = a.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (searchValue == a[mid]) {
                return mid;
            }
            else if (searchValue > a[mid]) {
                low = mid + 1;
                mid = (low + high) / 2;
            }
            else {
                high = mid - 1;
                mid = (low + high) / 2;
            }
        }
        return -1;
    }
}