class Solution {
    public int maximumWealth(int[][] acc) {
        int n=acc[0].length;
        int m=acc.length;
        int sum=0;
        
        for(int i=0;i<m;i++)
        {
            int csum=0;
            for(int j=0;j<n;j++)
            {
                csum+=acc[i][j];
            }
            if(csum>sum)
                sum=csum;
        }
        return sum;
    }
}