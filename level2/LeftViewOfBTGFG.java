import java.util.*;

class Tree{
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
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
      
      if(root == null)
        return ans;
        
      Queue<Node> qu = new LinkedList<>();
      qu.add(root);
      
      while(qu.size() > 0){
          int size = qu.size();
          
          for(int i = 0; i < size; i++){
            Node temp = qu.remove();
            if(i == 0)
                ans.add(temp.data);
                
            if(temp.left != null){
              qu.add(temp.left);
            } 
            
            if(temp.right != null){
              qu.add(temp.right);
            }
          }
          
      }
      
      return ans;
    }
}