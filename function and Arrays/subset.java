import java.util.*;

public class subset {

    public static void subsetOfArr(int[] arr){
        int n = arr.length;
        int total = (int)Math.pow(2,n);

        for(int i = 0; i < total; i++){
            String str = " ";
            int temp = i;

            for(int j = n - 1; j >= 0; j--){
                int rem = temp % 2;
                temp /= 2;

                if(rem == 0){
                    str = "-\t" + str;
                }
                else{
                    str = arr[j] + "\t" + str;
                }
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        subsetOfArr(arr);
    }
}
