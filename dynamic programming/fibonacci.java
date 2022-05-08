// import java.lang.reflect.Array;
import java.util.*;
// import java.io.*;

public class fibonacci {

    public static void display(int[] arr){
        for(int ele : arr){
            System.out.println(ele);
        }
        System.out.println();
    }

    public static int fibR(int n){
        if(n <= 1){
            return n;
        }

        int nm1 = fibR(n - 1);
        int nm2 = fibR(n - 2);
        return nm1 + nm2;
    }

    public static int fibM(int n, int[] dp){
        if(n <= 1){
            dp[n] = n;
            return dp[n];
        }

        int nm1 = fibM(n - 1, dp);
        int nm2 = fibM(n - 2, dp);
        return dp[n] = nm1 + nm2;
    }

    public static int fibT(int N, int[] dp){
        for(int n = 0; n < dp.length; n++){
            if(n <= 1){
                dp[n] = n;
                continue;
            }
            
            int nm1 = dp[n-1];
            int nm2 = dp[n-2];
            dp[n] = nm1 + nm2;
            continue;
        }
        return dp[N];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int ans = fibR(n);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        // int ans = fibM(n, dp);
        int ans = fibT(n, dp);
        System.out.println(ans);
        display(dp);
        
    }
}
