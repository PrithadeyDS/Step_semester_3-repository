public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        // Pairwise comparison using nested loops
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Duplicate found early exit
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums1)); // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2)); // Output: false
    }
}
