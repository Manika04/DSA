import java.util.*;

public class search {

    public static void searchIn2DArr(int[][] arr, int x){
        int n = arr.length;
        int i = 0, j = n - 1;

        while(j >= 0 && i <= n - 1){
            int curr = arr[i][j];
            if(curr == x){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if(curr > x){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not Found");
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

        int x = sc.nextInt();
        searchIn2DArr(arr, x);
    }
}
