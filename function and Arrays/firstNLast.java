import java.util.*;

public class firstNLast {

    public static int firstIndex(int[] arr, int x){
        int li = 0, ri = arr.length - 1, fi = -1;

        while(li <= ri){
            int mid = (li + ri)/2;

            if(arr[mid] == x){
                fi = mid;
                ri = mid - 1;
            }
            else if(arr[mid] > x){
                ri = mid - 1;
            }
            else{
                li = mid + 1;
            }
        }
        return fi;
    }

    public static int lastIndex(int[] arr, int x){
        int li = 0, ri = arr.length - 1, last = -1;

        while(li <= ri){
            int mid = (li + ri)/2;

            if(arr[mid] == x){
                last = mid;
                li = mid + 1;
            }
            else if(arr[mid] > x){
                ri = mid - 1;
            }
            else{
                li = mid + 1;
            }
        }
        return last;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int fi = firstIndex(arr,x);
        int li = lastIndex(arr,x);
        System.out.println(fi);
        System.out.println(li);
    }
}
