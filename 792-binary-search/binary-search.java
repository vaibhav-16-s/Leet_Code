class Solution {
    public int search(int[] arr, int x) {
        int lw = 0;
        int hg = arr.length - 1;

        while (lw <= hg) {
            int md = lw + (hg - lw) / 2;

            if (arr[md] == x) {
                return md;
            }

            if (arr[md] < x) {
                lw = md + 1;
            } else {
                hg = md - 1;
            }
        }

        return -1; 
    }
}
