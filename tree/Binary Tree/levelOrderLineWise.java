import java.io.*;
import java.util.*;

public class levelOrderLineWise {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static void levelOrder(Node node) {
    // write your code here

    ArrayDeque<Node> queue = new ArrayDeque<>();
    queue.add(node);

    while(queue.size() > 0){
        Node temp = queue.remove();
        System.out.print(temp.data + " ");

        if(temp.left != null){
            queue.add(temp.left);
        }

        if(temp.right != null){
            queue.add(temp.right);
        }
    }
  }

  public static class LOPair {
    Node node;
    int vl; //vertical level

    LOPair(Node node, int vl) {
      this.node = node;
      this.vl = vl;
    }
  }
  public static void levelOrderPair(Node node) {
    Queue<LOPair> qu = new LinkedList<>();
    qu.add(new LOPair(node, 1));
    int cl = 1; //current level

    while(qu.size() > 0){
      LOPair loPair = qu.remove();
      if(loPair.vl > cl){
        System.out.println();
        cl = loPair.vl;
      }

      System.out.print(loPair.node.data + " ");
      if(loPair.node.left != null){
        LOPair lpair = new LOPair(loPair.node.left, loPair.vl + 1);
        qu.add(lpair);
      }

      if(loPair.node.right != null){
        LOPair rpair = new LOPair(loPair.node.right, loPair.vl + 1);
        qu.add(rpair);
      }
    }
  }

  public static void levelOrderLW(Node node) {
    // write your code here

    Queue<Node> queue = new LinkedList<>();
    queue.add(node);
    queue.add(null);

    while(queue.size() > 0){
        Node temp = queue.remove();

        if(temp != null){
            System.out.print(temp.data + " ");

            if(temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right != null){
                queue.add(temp.right);
            }
        } else {
            if(queue.size() > 0){
                System.out.println();
                queue.add(temp);
            }
        }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    levelOrder(root);
  }

}