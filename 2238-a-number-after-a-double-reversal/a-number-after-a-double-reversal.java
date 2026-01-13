class Solution {
    public boolean isSameAfterReversals(int num) {
        int y=num;
        int t=0;
        for(;num>0;)
        {
            int s=num%10;
             t=t*10+s;
             num/=10;
        }
        int u=0;
        for(;t>0;)
        {
            int s=t%10;
            u=u*10+s;
            t/=10;
        }
        if(u==y)
            return true;
        else
            return false;

        
    }
}