import java.util.*;

public class encoding {

    public static void printEncoding(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        if(str.charAt(0) == '0'){
            return;
        }

        char ch1 = str.charAt(0);
        int v1 = ch1 - '0';
        printEncoding(str.substring(1), ans + (char)(v1 + 'a' - 1));
        if(str.length() > 1){
            char ch2 = str.charAt(1);
            int v2 = ch2 - '0';
            int num = v1 * 10 + v2;
            if(num <= 26){
                printEncoding(str.substring(2), ans + (char)(num + 'a' - 1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncoding(str, "");
    }
}
