import java.util.*;

public class matrixMul {
    public static int [][] matrixMultiplication(int [][] A, int [][] B){
        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;
        
        int[][] C = new int[n1][m2];
        
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < m2; j++){
                int sum = 0;
                for(int k = 0; k < m1; k++){
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int m1 = sc.nextInt();
    
    int[][] A = new int[n1][m1];
    for(int i = 0; i < n1; i++){
        for(int j = 0; j < m1; j++){
            A[i][j] = sc.nextInt();
        }
    }
    
    int n2 = sc.nextInt();
    int m2 = sc.nextInt();
    
    int[][] B = new int[n2][m2];
    for(int i = 0; i < n2; i++){
        for(int j = 0; j < m2; j++){
            B[i][j] = sc.nextInt();
        }
    }
    
    if(m1 != n2){
        System.out.println("Invalid input");
    }
    else{
        int[][] C = matrixMultiplication(A,B);
        for(int i = 0; i < C.length; i++){
            for(int j = 0; j <C[0].length; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
}
