import java.util.*;

public class targetSumSubsets {

    public static void printTargetSumSubsets(int[] arr, int idx, String asf, int sum, int tar){
        if(sum > tar){
            return;
        }

        if(idx == arr.length){
            if(sum == tar){
                System.out.println(asf + ". ");
            }
            return;
        }
        //if picked
        printTargetSumSubsets(arr, idx + 1, asf + arr[idx] + ", ", sum + arr[idx], tar);
        
        //not picked
        printTargetSumSubsets(arr, idx + 1, asf, sum, tar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        printTargetSumSubsets(arr,0,"",0,tar);
    }
}
