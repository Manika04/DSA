import java.util.*;

public class brokenEconomy {
    public static void brokenEco(int[] arr, int x){
        int li = 0, ri = arr.length - 1;
        int ceil = 0, floor = 0;

        while(li <= ri){
            int mid = (li+ri)/2;

            if(arr[mid] == x){
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
            else if(arr[mid] > x){
                ceil = arr[mid];
                ri = mid - 1;
            }
            else{
                floor = arr[mid];
                li = mid + 1;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        brokenEco(arr, x);
    }
}
