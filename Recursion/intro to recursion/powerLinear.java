import java.util.*;

public class powerLinear {

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int val  = power(x, n - 1);
        int ans = x * val;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x,n);
        System.out.println(ans);
    }
}
