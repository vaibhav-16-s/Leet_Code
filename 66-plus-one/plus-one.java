class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // handle carry from right
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // only reaches here if all digits were 9
        int[] n1 = new int[n + 1];
        n1[0] = 1;
        return n1;
    }
}
