import java.util.*;

public class rotateArr {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
  
    public static void reverse(int[] a, int i, int j){      
      while(i <= j){
          swap(a,i,j);
          i++;
          j--;
      }
    }

    public static void rotate(int[] a, int k){
        k = k % a.length;
        if(k < 0){
            k += a.length;
        }

        int n = a.length;
        reverse(a, 0, n-k-1);
        reverse(a, n-k, n-1);
        reverse(a, 0, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        rotate(arr,k);
        display(arr);
    }
}
