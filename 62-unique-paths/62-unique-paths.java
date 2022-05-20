class Solution {
    public int[][] dp;
    
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int[] dp1 : dp) {
            Arrays.fill(dp1, -1);
        }        
        return CountPath(0,0,m,n);
    }
    
    public int CountPath(int i, int j, int m, int n){
        if(i>= m || j >= n) {
            return 0;
        }
        
        if(i==m-1 && j==n-1) {
            return 1;
        }
        
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        
        return dp[i][j] = CountPath(i+1,j,m,n) + CountPath(i,j+1,m,n);
    }
}