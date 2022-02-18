import java.util.*;

public class invertedBarChart {
    public static int maximum(int [] arr){
        int max = -(int)1e9;
        for(int i = 0; i<arr.length; i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void barChart(int [] arr){
        int height = maximum(arr);
        
        for(int h = 1 ; h <= height ; h++){
            for(int i = 0; i<arr.length; i++){
                if(arr[i] >= h){
                    System.out.print("*	");
                }
                else{
                    System.out.print("	");
                }
            }
            System.out.println();
        }
    }
    
  public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        barChart(arr);
    }
 }
}
