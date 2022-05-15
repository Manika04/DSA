import java.util.*;

public class findElement {
    public static void find(int[] arr, int d){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == d){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] arg){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int d = sc.nextInt();
            find(arr, d);
        }
    }
}
