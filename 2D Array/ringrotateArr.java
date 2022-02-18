import java.util.*;

public class ringrotateArr {
    public static int[] from2dTo1D(int[][] arr, int s){
        int n = arr.length, m = arr[0].length;
        int minr = s - 1, minc = s - 1;
        int maxr = n - s, maxc = m - s;

        int size = 2 * (maxr - minr + maxc - minc);
        int [] oneD = new int[size];
        int idx = 0;

        for(int i = minr; i <= maxr; i++){
            oneD[idx] = arr[i][minc];
            idx++;
        }
        minc++;

        for(int j = minc; j <= maxc; j++){
            oneD[idx] = arr[maxr][j];
            idx++;
        }
        maxr--;

        for(int i = maxr; i >= minr; i--){
            oneD[idx] = arr[i][maxc];
            idx++;
        }
        maxc--;

        for(int j = maxc; j >= minc; j--){
            oneD[idx] = arr[minr][j];
            idx++;
        }
        minr++;

        return oneD;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int i, int j){
        while(i <= j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void rotate(int[] arr, int r){
        r = r % arr.length;
        if(r < 0){
            r += arr.length;
        }

        reverse(arr, 0, arr.length - r -1);
        reverse(arr, arr.length - r, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void from1Dto2D(int[] oneD, int[][] arr, int s){
        int n = arr.length, m = arr[0].length;
        int minr = s - 1, minc = s - 1;
        int maxr = n - s, maxc = m - s;
        int idx = 0;

        for(int i = minr; i <= maxr; i++){
            arr[i][minc] = oneD[idx];
            idx++;
        }
        minc++;

        for(int j = minc; j <= maxc; j++){
            arr[maxr][j] = oneD[idx];
            idx++;
        }
        maxr--;

        for(int i = maxr; i >= minr; i--){
            arr[i][maxc] = oneD[idx];
            idx++;
        }
        maxc--;

        for(int j = maxc; j >= minc; j--){
            arr[minr][j] = oneD[idx];
            idx++;
        }
        minr++;

    }

    public static void ringRotate(int[][] arr, int s, int r){
        int[] oneD = from2dTo1D(arr,s);
        rotate(oneD, r);
        from1Dto2D(oneD, arr, s);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int s = sc.nextInt();
        int k = sc.nextInt();

        ringRotate(arr,s,k);
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
