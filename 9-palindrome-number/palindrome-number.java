class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int r=0;
        for(;x>0;)
        {
            int t=x%10;
            r=r*10+t;
            x/=10;
        }
        if(r==y)
            return true;
        else
            return false;
    }
}