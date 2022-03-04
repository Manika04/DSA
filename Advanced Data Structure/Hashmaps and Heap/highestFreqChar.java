import java.util.*;
// import java.io.*;

public class highestFreqChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashMap<Character, Integer> hm = new HashMap<>();
        //stored the characters and their frequency in hashmap
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(hm.containsKey(ch)){
                int val = hm.get(ch);
                hm.put(ch, val+1);
            }
            else{
                hm.put(ch, 1);
            }

            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        //Find the max from hashmap containing all the characters and thier frequency
        char maxFreqChar = s.charAt(0);
        for(Character key : hm.keySet()){
            if(hm.get(key) > hm.get(maxFreqChar)){
                maxFreqChar = key;
            }
        }

        System.out.println(maxFreqChar);
    }
}
