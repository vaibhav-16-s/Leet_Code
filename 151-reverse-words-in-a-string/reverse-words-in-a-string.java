class Solution {
    public String reverseWords(String s) {
        String[] ca=s.trim().split("\\s+");
        int left = 0;
        int right = ca.length - 1;
        
        while (left < right) {
            String temp = ca[left];
            ca[left] = ca[right];
            ca[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", ca);
    }
}