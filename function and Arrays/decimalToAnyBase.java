import java.util.Scanner;

public class decimalToAnyBase {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int ans = getValueInBase(n, b);
        System.out.println(ans);
    }
}
