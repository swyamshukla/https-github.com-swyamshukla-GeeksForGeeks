/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
        
        static int depth(Node root){
            if(root==null) return 0;
            return 1 +Math.max(depth(root.left),depth(root.right));
        }
        
  
    public boolean isBalanced(Node root) {
        // code here
                    
            if(root==null) return true;
            int left = depth(root.left);
            int right = depth(root.right);
            return Math.abs(left - right)<=1 && isBalanced(root.left)&&isBalanced(root.right);
            
    
        
        
    }
}