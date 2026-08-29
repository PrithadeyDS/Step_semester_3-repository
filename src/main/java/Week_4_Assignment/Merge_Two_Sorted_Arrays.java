import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int p1 = 0, p2 = 0, pResult = 0;

        // Compare elements from both arrays using two pointers
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] <= arr2[p2]) {
                result[pResult++] = arr1[p1++];
            } else {
                result[pResult++] = arr2[p2++];
            }
        }

        // Copy remaining elements from arr1
        while (p1 < arr1.length) {
            result[pResult++] = arr1[p1++];
        }

        // Copy remaining elements from arr2
        while (p2 < arr2.length) {
            result[pResult++] = arr2[p2++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2))); // Output: [1, 2, 3, 4, 5, 6]

        int[] arr3 = {};
        int[] arr4 = {1, 2, 3};
        System.out.println(Arrays.toString(mergeSortedArrays(arr3, arr4))); // Output: [1, 2, 3]
    }
}