import java.util.*;

public class rotateBy90 {

    public static void transpose(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] arr){
        for(int i = 0; i< arr.length; i++){
            int li = 0;
            int ri = arr.length - 1;

            while(li <= ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
            }
        }
    }

    public static void rotate(int[][] arr){
        transpose(arr);
        reverse(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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

        rotate(arr);
        display(arr);
    }

    
}
