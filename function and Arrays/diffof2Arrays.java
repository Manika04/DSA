import java.util.*;

public class diffof2Arrays {

    public static int[] diffOfArr(int[] A, int[] B){
        int borrow = 0;
        int[] ans = new int[B.length];
        int i = A.length - 1;
        int j = B.length - 1;
        int k = ans.length - 1;

        while(j >= 0){
            int digit = 0;
            digit += B[j] + borrow;

            if(i >= 0){
                digit -= A[i];
            }
            if(digit < 0){
                digit += 10;
                borrow = -1;
            }
            int val = digit % 10;
            ans[k] = val;
            i--;
            j--;
            k--;
        }
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int[] A = new int[n1];
            for(int i = 0; i < n1; i++){
                A[i] = sc.nextInt();
            }

            int n2 = sc.nextInt();
            int[] B = new int[n2];
            for(int i = 0; i < n2; i++){
                B[i] = sc.nextInt();
            }

            int[] ans = diffOfArr(A,B);


            int index = -1;
            for(int i = 0; i < ans.length; i++){
                if(ans[i] != 0){
                    index = i;
                    break;
                }
            }

            if(index == -1){
                System.out.println("0");
                return;
            }

            for(int i = index; i < ans.length; i++){
                System.out.println(ans[i]);
            }
        }
    }
}
