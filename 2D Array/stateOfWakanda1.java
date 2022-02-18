import java.util.*;

public class stateOfWakanda1 {
    public static void wakanda(int[][] arr){
        int i, j;
        for(j = 0;  j < arr[0].length; j++){
            if( j % 2 == 0){
                for(i = 0; i < arr.length; i++){
                    System.out.println(arr[i][j]);
                }
            }else{
                for(i = arr.length - 1; i >= 0; i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        wakanda(arr);
    }
}
