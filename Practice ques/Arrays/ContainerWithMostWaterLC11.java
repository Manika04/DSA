class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0, area = 1;
        int i = 0, j = height.length - 1;
        
        while(i <= j){
            if(height[i] < height[j]){
                area = height[i] * (j - i);
                i++;
            }
            
            else{
                area = height[j] * (j - i);
                j--;
            }
            
            if(maxWater < area)
                maxWater = area;
        }
        
        return maxWater;
    }
}