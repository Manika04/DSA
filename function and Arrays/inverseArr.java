import java.util.*;

public class inverseArr {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + "\n");
        }
        System.out.println(sb);
      }

      public static int[] inverse(int[] a){
          int[] ans = new int[a.length];
          for(int i = 0; i < a.length; i++){
              int val = a[i];
              ans[val] = i;
          }
          return ans;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = inverse(arr);
        display(ans);
    }
}
