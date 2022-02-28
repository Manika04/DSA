import java.util.*;
import java.io.*;

public class LLToAdapters {
    public static class LLtoStackAdapter {
        LinkedList<Integer> list;
    
        public LLtoStackAdapter() {
          list = new LinkedList<>();
        }
    
    
        int size() {
          return list.size();
        }
    
        void push(int val) {
          list.addFirst(val);
        }
    
        int pop() {
          return list.removeFirst();
        }
    
        int top() {
          if(size() == 0){
            System.out.println("Stack underflow");
            return -1;
          }
          return list.getFirst();
        }
      }

      public static class LLToQueueAdapter {
    LinkedList<Integer> list;

    public LLToQueueAdapter() {
      list = new LinkedList<>();
    }

    int size() {
      return list.size();
    }

    void add(int val) {
      list.addLast(val);
    }

    int remove() {
      if(list.size() == 0){
        System.out.println("Queue underflow");
        return -1;
      }
      else{
        return list.removeFirst();
      }
    }

    int peek() {
      if(list.size() == 0){
        System.out.println("Queue underflow");
        return -1;
      }
      else{
        return list.getFirst();
      }
    }
    
      public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LLToAdapters st = new LLToAdapters();
    
        String str = br.readLine();
        while(str.equals("quit") == false){
          if(str.startsWith("push")){
            int val = Integer.parseInt(str.split(" ")[1]);
            st.push(val);
          } else if(str.startsWith("pop")){
            int val = st.pop();
            if(val != -1){
              System.out.println(val);
            }
          } else if(str.startsWith("top")){
            int val = st.pop();
            if(val != -1){
              System.out.println(val);
            }
          } else if(str.startsWith("size")){
            System.out.println(st.size());
          }
          str = br.readLine();
        }
      }
}

      public void push(int val) {
      }

      public char[] size() {
        return null;
      }

      public int pop() {
        return 0;
      }
    }
