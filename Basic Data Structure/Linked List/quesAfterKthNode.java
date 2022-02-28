import java.io.*;

public class quesAfterKthNode {
    public static class Node {
        int data;
        Node next;
      }
    
      public static class LinkedList {
        Node head;
        Node tail;
        int size;
    
        void addLast(int val) {
          Node temp = new Node();
          temp.data = val;
          temp.next = null;
    
          if (size == 0) {
            head = tail = temp;
          } else {
            tail.next = temp;
            tail = temp;
          }
    
          size++;
        }
    
        public int size() {
          return size;
        }
    
        public void display() {
          for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
          }
          System.out.println();
        }
    
        public void removeFirst() {
          if (size == 0) {
            System.out.println("List is empty");
          } else if (size == 1) {
            head = tail = null;
            size = 0;
          } else {
            head = head.next;
            size--;
          }
        }
    
        public int getFirst() {
          if (size == 0) {
            System.out.println("List is empty");
            return -1;
          } else {
            return head.data;
          }
        }
    
        public int getLast() {
          if (size == 0) {
            System.out.println("List is empty");
            return -1;
          } else {
            return tail.data;
          }
        }
    
        public int getAt(int idx) {
          if (size == 0) {
            System.out.println("List is empty");
            return -1;
          } else if (idx < 0 || idx >= size) {
            System.out.println("Invalid arguments");
            return -1;
          } else {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
              temp = temp.next;
            }
            return temp.data;
          }
        }
    
        public void addFirst(int val) {
          Node temp = new Node();
          temp.data = val;
          temp.next = head;
          head = temp;
    
          if (size == 0) {
            tail = temp;
          }
    
          size++;
        }
    
        public void addAt(int idx, int val) {
          if (idx < 0 || idx > size) {
            System.out.println("Invalid arguments");
          } else if (idx == 0) {
            addFirst(val);
          } else if (idx == size) {
            addLast(val);
          } else {
            Node node = new Node();
            node.data = val;
    
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
              temp = temp.next;
            }
            node.next = temp.next;
    
            temp.next = node;
            size++;
          }
        }
    
        public void removeLast() {
          if (size == 0) {
            System.out.println("List is empty");
          } else if (size == 1) {
            head = tail = null;
            size = 0;
          } else {
            Node temp = head;
            for (int i = 0; i < size - 2; i++) {
              temp = temp.next;
            }
    
            tail = temp;
            tail.next = null;
            size--;
          }
        }
    
        public void removeAt(int idx) {
          if (idx < 0 || idx >= size) {
            System.out.println("Invalid arguments");
          } else if (idx == 0) {
            removeFirst();
          } else if (idx == size - 1) {
            removeLast();
          } else {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
              temp = temp.next;
            }
    
            temp.next = temp.next.next;
            size--;
          }
        }
    
        private Node getNodeAt(int idx) {
          Node temp = head;
          for (int i = 0; i < idx; i++) {
            temp = temp.next;
          }
          return temp;
        }
    
        public void reverseDI() {
          int li = 0;
          int ri = size - 1;
          while(li < ri){
            Node left = getNodeAt(li);
            Node right = getNodeAt(ri);
    
            int temp = left.data;
            left.data = right.data;
            right.data = temp;
    
            li++;
            ri--;
          }
        }
     
        public void reversePI(){
          if(size <= 1){
            return;
          }
    
          Node prev = null;
          Node curr = head;
          while(curr != null){
            Node next = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = next;
          }
    
          Node temp = head;
          head = tail;
          tail = temp;
        }
      
        public int kthFromLast(int k){
          Node slow = head;
          Node fast = head;
          for(int i = 0; i < k; i++){
            fast = fast.next;
          }
          while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
          }
    
          return slow.data;
        }

        public int mid(){
          Node fast = head;
          Node slow = head;

          while(fast.next != null && fast.next.next != null){
            fast = fast.next;
            slow = slow.next;
          }

          return slow.data;
        }

        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
          Node one = l1.head;
          Node two = l2.head;
          LinkedList res = new LinkedList();
          
          while(one != null && two != null){
              if(one.data < two.data){
                  res.addLast(one.data);
                  one = one.next;
              }
              else{
                  res.addLast(two.data);
                  two = two.next;
              }
          }

          while(one != null){
              res.addLast(one.data);
              one = one.next;
          }

          while(two != null){
              res.addLast(two.data);
              two = two.next;
          }

          return res;
        }

        public static Node midNode(Node head, Node tail){
          Node fast =  head;
          Node slow = head;

          while(fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
          }

          return slow;
        }

        public static LinkedList mergeSort(Node head, Node tail){
          if(head == tail){
            LinkedList base = new LinkedList();
            base.addLast(head.data);
            return base;
          }

          Node mid = midNode(head, tail);
          LinkedList left = mergeSort(head, mid);
          LinkedList right = mergeSort(mid.next, tail);
          LinkedList res = mergeTwoSortedLists(left, right);
          return res;
        }

        public void removeDuplicates(){
          LinkedList ans = new LinkedList();
          while(this.size > 0){
            int val = this.getFirst();
            this.removeFirst();
            while(ans.size == 0 || ans.tail.data != val){
              ans.addLast(val);
            }
          }
    
          this.head = ans.head;
          this.tail = ans.tail;
          this.size = ans.size;
        }
        
        public void oddEven(){
          LinkedList even = new LinkedList();
          LinkedList odd = new LinkedList();
    
          while(this.size > 0){
            int val = this.getFirst();
            this.removeFirst();
            if(val % 2 == 0){
              even.addLast(val);
            }
            else{
              odd.addLast(val);
            }
          }
    
          if(odd.size > 0 && even.size > 0){
            odd.tail.next = even.head;
            this.head = odd.head;
            this.tail = even.tail;
            this.size = odd.size + even.size;
          }
    
          else if(odd.size > 0){
            this.head = odd.head;
            this.tail = odd.tail;
            this.size = odd.size;
          }
          else if(even.size > 0){
            this.head = even.head;
            this.tail = even.tail;
            this.size = even.size;
          }
        }

        public void kReverse(int k) {
          LinkedList prev = null;
    
          while(this.size > 0){
            LinkedList curr = new LinkedList();
            if(this.size >= k){
              for(int i = 0; i < k; i++){
                int val = this.getFirst();
                this.removeFirst();
                curr.addFirst(val);
              }
            }
            //Jab last mein k se less than elements bache ho. 
            else{
              int remainingSize = this.size();
              for(int i = 0; i < remainingSize; i++){
                int val = this.getFirst();
                this.removeFirst();
                curr.addLast(val);
              }
            }
    
            if(prev == null){
              prev = curr;
            }
            else{
              prev.tail.next = curr.head;
              prev.tail = curr.tail;
              prev.size += curr.size;
            }
          }
    
          this.head = prev.head;
          this.tail = prev.tail;
          this.size = prev.size;
        }

        // Display reverse recursively
        private void displayReverseHelper(Node node){
          if(node == null){
            return;
          }
    
          displayReverseHelper(node.next);
          System.out.print(node.data + " ");
        }
    
        public void displayReverse(){
          displayReverseHelper(head);
          System.out.println();
        }

        //Display reverse pointer recursive
        private void reversePRHelper(Node node){
          if(node == null){
            return;
          }
    
          reversePRHelper(node.next);
          if(node != tail){
            node.next.next = node;
          }
        }
    
        public void reversePR(){
          reversePRHelper(this.head);
          Node temp = head;
          head = tail;
          tail = temp;
        }

      }
    
      public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();
    
        String str = br.readLine();
        while (str.equals("quit") == false) {
          if (str.startsWith("addLast")) {
            int val = Integer.parseInt(str.split(" ")[1]);
            list.addLast(val);
          } else if (str.startsWith("size")) {
            System.out.println(list.size());
          } else if (str.startsWith("display")) {
            list.display();
          } else if (str.startsWith("removeFirst")) {
            list.removeFirst();
          } else if (str.startsWith("getFirst")) {
            int val = list.getFirst();
            if (val != -1) {
              System.out.println(val);
            }
          } else if (str.startsWith("getLast")) {
            int val = list.getLast();
            if (val != -1) {
              System.out.println(val);
            }
          } else if (str.startsWith("getAt")) {
            int idx = Integer.parseInt(str.split(" ")[1]);
            int val = list.getAt(idx);
            if (val != -1) {
              System.out.println(val);
            }
          } else if (str.startsWith("addFirst")) {
            int val = Integer.parseInt(str.split(" ")[1]);
            list.addFirst(val);
          } else if (str.startsWith("addAt")) {
            int idx = Integer.parseInt(str.split(" ")[1]);
            int val = Integer.parseInt(str.split(" ")[2]);
            list.addAt(idx, val);
          } else if (str.startsWith("removeLast")) {
            list.removeLast();
          } else if (str.startsWith("removeAt")) {
            int idx = Integer.parseInt(str.split(" ")[1]);
            list.removeAt(idx);
          } else if(str.startsWith("reverseDI")){
            list.reverseDI();
          } else if(str.startsWith("reversePI")){
            list.reversePI();
          } else if(str.startsWith("kthFromEnd")){
            int idx = Integer.parseInt(str.split(" ")[1]);
            System.out.println(list.kthFromLast(idx));
          }
          str = br.readLine();
        }
      }
}
