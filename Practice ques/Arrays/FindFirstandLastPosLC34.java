class Solution {
    public int firstIndex(int[] arr, int x){
        int li = 0, ri = arr.length - 1;
        int first = -1;

        while(li <= ri){
            int mid = (li + ri)/2;
            if(arr[mid] == x){
                first = mid;
                ri = mid - 1;
            }
            else if(arr[mid] > x){
                ri = mid - 1;
            }
            else{
                li = mid + 1;
            }
        }

        return first;
    }
    
     public int lastIndex(int[] arr, int x){
        int li = 0, ri = arr.length - 1;
        int last = -1;

        while(li <= ri){
            int mid = (li + ri)/2;
            if(arr[mid] == x){
                last = mid;
                li = mid + 1;
            }
            else if(arr[mid] > x){
                ri = mid - 1;
            }
            else{
                li = mid + 1;
            }
        }

        return last;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int li = firstIndex(nums, target);
        int ri = lastIndex(nums, target);
        
        int[] ans = new int[2];
        ans[0] = li;
        ans[1] = ri;
        
        return ans;
    }
}