class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int i = 0, j = n - 1;
        
        while(j >= 0 && i < matrix.length){
            int curr = matrix[i][j];
             if(curr == target)
                 return true;
            
            else if(curr > target)
                j--;
            else
                i++;
        }
        
        return false;
    }
}