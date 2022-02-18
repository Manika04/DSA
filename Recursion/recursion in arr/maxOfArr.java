import java.util.*;

public class maxOfArr {

    public static int max(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }

        int recAns = max(arr, idx + 1);
        int currAns = arr[idx];
        if(currAns > recAns){
            return currAns;
        }
        else{
            return recAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = max(arr, 0);
        System.out.println(ans);
    }    
}
