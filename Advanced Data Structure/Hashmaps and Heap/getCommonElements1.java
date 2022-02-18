import java.util.*;

public class getCommonElements1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] A = new int[n1];
        for(int i = 0; i < n1; i++){
            A[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] B = new int[n2];
        for(int i = 0; i < n2; i++){
            B[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int ele : A){
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        }

        for(int ele : B){
            if(hm.containsKey(ele)){
                System.out.println(ele);

                hm.remove(ele);
            }
        }
    }
}
