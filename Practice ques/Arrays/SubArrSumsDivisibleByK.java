import java.util.HashMap;

public class SubArrSumsDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0; 
        int count = 0; //No. of subArrays
       
       //Takes care the frequency of remainder(rem)
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(sum,1); //setting the frequency to 1 in the starting using sum as sum and rem both initially are 0
       
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            int rem = sum % k;
            if(rem<0)
                rem += k; //this handeling if there is -ve rem : add k to it to make it +ve
            
            if(map.containsKey(rem) == true){ //If the rem already exists then
                int freq = map.get(rem); // gets its prev  frequency
                count = count + freq;    // add it to count
               
                 map.put(rem,freq+1); // Put back in hashmap with increased frequency
            }
            else{
                map.put(rem,1); //add the new rem with freq 1

            }
        }
       return count;
   }
}
