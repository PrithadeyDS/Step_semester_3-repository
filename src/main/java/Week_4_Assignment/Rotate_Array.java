import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] nums, int k) {
        if (nums.length == 0) return nums;

        int n = nums.length;
        k = k % n; // Handle k larger than array length
        int[] newArray = new int[n];

        // Calculate new index for each element
        for (int i = 0; i < n; i++) {
            newArray[(i + k) % n] = nums[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        System.out.println(Arrays.toString(rotateArray(nums1, k1))); // Output: [5, 6, 7, 1, 2, 3, 4]

        int[] nums2 = {1, 2};
        int k2 = 3;
        System.out.println(Arrays.toString(rotateArray(nums2, k2))); // Output: [2, 1]
    }
}