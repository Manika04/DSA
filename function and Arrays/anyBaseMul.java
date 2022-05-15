import java.util.*;

public class anyBaseMul {
    public static int anyBaseAddition(int n, int m, int b) {
        int ans = 0, pow = 1, carry = 0;

        while (n != 0 || m != 0 || carry != 0) {
            int sum = carry + n % 10 + m % 10;
            n /= 10;
            m /= 10;

            carry = sum / b;
            sum %= b;

            ans += sum * pow;
            pow *= 10;
        }

        return ans;
    }
 
 public static int multiplyDigitWithNumber(int n, int digit, int base) {
        int ans = 0, carry = 0, pow = 1;
        while (n != 0 || carry != 0) {
            int prod = carry + (n % 10) * digit;
            n /= 10;

            carry = prod / base;
            prod %= base;

            ans += prod * pow;
            pow *= 10;
        }

        return ans;
    }

    public static int getProduct(int b, int n, int m) {
        int ans = 0, pow = 1;
        while (m != 0) {
            int digitMultiply = multiplyDigitWithNumber(n, m % 10, b);
            m /= 10;

            ans = anyBaseAddition(ans, digitMultiply * pow, b);
            pow *= 10;
        }

        return ans;
    }

public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }
 }
}

