import java.util.*;

public class spiralDisplay {

    public static void spiral(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        int minR = 0;
        int minC = 0;
        int maxR = n - 1;
        int maxC = m - 1;
        int count = 0;
        int total = n * m;

        while(count < total){
            for(int i = minR; i <= maxR && count<total; i++){
                System.out.println(matrix[i][minC]);
                count ++;
            }
            minC++;

            for(int j = minC; j <= maxC && count < total; j++){
                System.out.println(matrix[maxR][j]);
                count++;
            }
            maxR--;

            for(int i = maxR; i >= minR && count<total; i--){
                System.out.println(matrix[i][maxC]);
                count ++;
            }
            maxC --;

            for(int j = maxC; j >= minC && count < total; j--){
                System.out.println(matrix[minR][j]);
                count++;
            }
            minR++;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[][] arr = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            spiral(arr);
        }
    }
}
