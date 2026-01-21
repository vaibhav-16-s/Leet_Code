class Solution {
    public int reverse(int x) {

        int y = Math.abs(x);
        int s = 0;

        while (y > 0) {
            int t = y % 10;

            if (s > (Integer.MAX_VALUE - t) / 10)
                return 0;

            s = s * 10 + t;
            y /= 10;
        }

        return x < 0 ? -s : s;
    }
}
