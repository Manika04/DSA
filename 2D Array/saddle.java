import java.util.*;

public class saddle {

    public static void saddlePrice(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            int svj = 0; //smallest value j
            for(int j = 1; j < arr.length; j++){
                if(arr[i][j] < arr[i][svj]){
                    svj = j;
                }
            }

            boolean flag = true;
            for(int k = 0; k < arr.length; k++){
                if(arr[k][svj] > arr[i][svj]){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");
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

        saddlePrice(arr);
    }
}
