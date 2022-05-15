import java.util.Scanner;

public class anyBaseAdd {
    public static int getSum(int b, int n1, int n2){
        int ans = 0, pow = 1, carry = 0;
        while(n1 != 0 || n2 != 0 || carry != 0){
            int sum = carry + (n1 != 0 ? n1 % 10 : 0) + (n2 != 0 ? n2 % 10 : 0);
            n1 /= 10;
            n2 /= 10;
            carry = sum/b;
            sum %= b;
            ans += sum * pow;
            pow *= 10;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int b = scn.nextInt();
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
   
            int d = getSum(b, n1, n2);
            System.out.println(d);
        }
     }
}
