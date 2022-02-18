import java.util.*;

public class exitPointOfMatrix {

    public static void exitPt(int[][] mat){
        int i = 0, j = 0, dir = 0;
        int n = mat.length, m = mat[0].length;

        while(true){
            dir += mat[i][j];
            dir %= 4;

            if(dir == 0){
                j++;
            }
            else if(dir == 1){
                i++;
            }
            else if(dir == 2){
                j--;
            }
            else{
                i--;
            }

            if(i < 0 || j < 0 || i >= n || j >= m){
                break;
            }
        }

        if(i < 0){
            i++;
        }
        else if(i >= n){
            i--;
        }
        if(j < 0){
            j++;
        }
        else if(j >= m){
            j--;
        }

        System.out.println(i);
        System.out.println(j);
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
        exitPt(arr);
    }   
}
