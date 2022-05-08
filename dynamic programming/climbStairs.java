import java.util.*;

public class climbStairs {

    public static int climbStairsR(int n){
        if(n == 0)
            return 1;

        int count = 0;
        if(n - 1 >= 0)
            count += climbStairsR(n - 1); 

        if(n - 2 >= 0)
            count += climbStairsR(n - 2); 

        if(n - 3 >= 0)
            count += climbStairsR(n - 3);   
            
        return count;    
    }

    public static int climbStairsM(int n, int[] dp){
        if(n == 0)
            return dp[n] = 1;

        int count = 0;
        if(n - 1 >= 0)
            count += climbStairsM(n - 1, dp); 

        if(n - 2 >= 0)
            count += climbStairsM(n - 2, dp); 

        if(n - 3 >= 0)
            count += climbStairsM(n - 3, dp);   
            
        return dp[n] = count;    
    }

    public static int climbStairsT(int N, int[] dp){
        for(int n = 0; n < dp.length; n++){
            if(n == 0){
                dp[n] = 1;
                continue;
            }

            if(dp[n] != -1){
                return dp[n];
            }

            int count = 0;

            if(n - 1 >= 0)
                count += dp[n - 1]; 

            if(n - 2 >= 0)
                count += dp[n - 2]; 

            if(n - 3 >= 0)
                count += dp[n - 3];
            
            dp[n] = count;    
        } 
        return dp[N];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int ans = climbStairsR(n);
        // int ans = climbStairsM(n);
        // int ans = climbStairsT(n);
        System.out.println(ans);
    }
}
