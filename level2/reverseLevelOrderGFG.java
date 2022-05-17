import java.util.*;

class Tree
{
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
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        
        while(queue.size() > 0){
            Node temp = queue.remove();
            ans.add(temp.data);
            
            if(temp.right != null){
                queue.add(temp.right);
            }
            
            if(temp.left != null){
                queue.add(temp.left);
            }
        }
        
        Collections.reverse(ans);
        return ans;
    }
}      