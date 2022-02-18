import java.util.*;

public class anyBaseToAnyBase{
    public static int getValueInBase(int n, int b) {
        int ans = 0, pow = 1;
        while(n != 0){
            int rem = n % b;
            n /= b;
            ans += rem * pow;
            pow *= 10;
        }
        return ans;
    }

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

    public static int anyBaseToAnybase(int n, int b1, int b2) {
        int dec = getValueInDecimal(n, b1);
        int res = getValueInBase(dec, b2);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int ans = anyBaseToAnybase(n, b1, b2);
        System.out.println(ans);
    }
    
}
