class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (c == s.charAt(j) ) {
                    count++;
                    if(count==2){
                        break;
                    }
                }
            }
            if (count == 1)
                return i;
        }
        return -1;
    }
}
