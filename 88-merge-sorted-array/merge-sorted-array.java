class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] a = new int[m + n];

        System.arraycopy(nums1, 0, a, 0, m);
        System.arraycopy(nums2, 0, a, m, n);

        Arrays.sort(a);

        System.arraycopy(a, 0, nums1, 0, m + n);
    }
}
