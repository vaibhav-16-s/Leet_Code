import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] nums = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            nums[i] = nums1[i];
        }

        for (int i = 0; i < n2; i++) {
            nums[n1 + i] = nums2[i];
        }

        Arrays.sort(nums);

        int n = nums.length;

        if (n % 2 == 0) {
            return (nums[n / 2 - 1] + nums[n / 2]) / 2.0;
        } else {
            return nums[n / 2];
        }
    }
}
