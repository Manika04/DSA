class Solution {
    public int[][] generateMatrix(int n) {
        //4 walls
        int minr = 0, minc = 0, maxr = n - 1, maxc = n - 1;
        int val = 1, total = n * n, count = 0;
        int[][] ans = new int[n][n];
        
        while(val <= total){
           for(int i = minc; i <= maxc && count < total; i++){
               ans[minr][i] = val;
               val++;
               count++;
           }
            minr++;
            
            for(int j = minr; j <= maxr && count < total; j++){
                ans[j][maxc] = val;
                val++;
                count++;
            }
            maxc--;
            
            for(int i = maxc; i >= minc && count < total; i--){
                ans[maxr][i] = val;
                val++;
                count++;
            }
            maxr--;
            
            for(int j = maxr; j >= minr && count < total; j--){
                ans[j][minc] = val;
                val++;
                count++;
            }
            minc++;
        }
        return ans;
    }
}