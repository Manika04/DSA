public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int ans = nums[i] +  nums[j];
                if(ans == target){
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }
        }
        return a;
    }
}
