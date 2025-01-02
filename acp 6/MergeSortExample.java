import java.util.Arrays;
import java.util.Scanner;

public class MergeSortExample {

    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: a single element array is already sorted
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }
        
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Do you want to sort in ascending or descending order? (Type 'ascending' or 'descending')");
        String order = scanner.next();

        mergeSort(array);

        if (order.equalsIgnoreCase("descending")) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));

        scanner.close();
    }
}
