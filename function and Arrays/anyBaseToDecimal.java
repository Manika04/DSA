import java.util.*;

public class anyBaseToDecimal {
    public static int getValueInDecimal(int n, int b) {
        int ans = 0, pow = 1;
        while(n != 0){
            int rem = n % 10;
            n /= 10;
            ans += rem * pow;
            pow *= b;
        }
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int b = sc.nextInt();
            int ans = getValueInDecimal(n, b);
            System.out.println(ans);
        }
    }
}
