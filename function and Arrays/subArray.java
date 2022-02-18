import java.util.*;

public class subArray {
    public static void subArr(int[] arr){
        int n = arr.length;

        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end++){
                for(int k = start; k <= end; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        subArr(arr);
    }
}
