//VALID PARENTHESES
import java.util.*;

public class leetcode20{

    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '{' || ch == '[' || ch == '('){
                st.push(ch);
            }
            else{
                if(st.size() == 0){
                    return false;
                }
                if(ch == '}' && st.peek() != '{'){
                    return false;
                }
                else if(ch == ']' && st.peek() != '['){
                    return false;
                }
                else if(ch == ')' && st.peek() != '('){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.size() == 0;
        // if(st.size() == 0){
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = isValid(s);
        System.out.println(ans);
    }
}