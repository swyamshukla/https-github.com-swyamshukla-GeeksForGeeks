/*
class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    
    static int count(Node tree){
        
        if(tree==null) return 0;
        return 1+count(tree.left)+count(tree.right);
        
    }
    
    static boolean check(Node root){
        if(root == null ) return true;
        if(root.left!=null && root.left.data>root.data) return false;
        if(root.right!=null && root.right.data>root.data) return false;
        return check(root.left) && check(root.right);
        
    }
    
    static boolean checkCBT(Node tree,int idx,int count){
        if(tree == null) return true;
        if(idx>=count) return false;
        
        return checkCBT(tree.left,2*idx+1,count) && checkCBT(tree.right,2*idx+2,count);
    }
    
    public boolean isHeap(Node tree) {
        // code here
        int count =count(tree);
        
        return check(tree) && checkCBT(tree,0,count);
        
        
    }
}