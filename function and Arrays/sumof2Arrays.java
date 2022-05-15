import java.util.*;

public class sumof2Arrays {

    public static void sumOfArr(int[] A, int[] B){
        int n1 = A.length;
        int n2 = B.length;
        int carry = 0;
        int size = (n1 > n2 ? n1 : n2);
        int[] ans = new int[size];

        int i = n1 -1;
        int j = n2 -1;
        int k = ans.length - 1;

        while(k >= 0){
            int sum = 0;
            sum += carry;

            if(i >= 0){
                sum += A[i];
            }
            if(j >= 0){
                sum += B[j];
            }

            int val = sum % 10;
            carry = sum/10;
            ans[k] = val;

            i--;
            j--;
            k--;
        }

        if(carry != 0){
            System.out.println(carry);
        }

        for(int ele : ans){
            System.out.println(ele);
        }
    }

    public static void main(String[] args){
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

            sumOfArr(A,B);
        }
    }
}
