class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat[0].length;
        int m=mat.length;
        int sum=0;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i==j)
                    sum+=mat[i][j];
                else if(i + j == n - 1) 
                    sum += mat[i][j];
                
            }

           
            
        }
        return sum;
    }
}