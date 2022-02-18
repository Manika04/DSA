import java.util.*;

public class stateOfWakanda2 {

    public static void wakanda(int[][] arr){
        for(int gap = 0; gap < arr.length; gap++){
            for(int i = 0, j = gap; j < arr.length; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        wakanda(arr);
    }
}
