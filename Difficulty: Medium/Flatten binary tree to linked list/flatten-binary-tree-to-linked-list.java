// User function Template for Java

class Solution {
    
    
    
    static void toLL(Node root){
        if(root==null) return;
        
        Node leftTree = root.left;
        Node rightTree = root.right;
        root.right=leftTree;
        root.left=null;
        
        
        Node temp = root;
        while(temp.right!=null){
            temp=temp.right;
        }
        temp.right=rightTree;
        
        
        toLL(root.left);
        toLL(root.right);

    }
        
    
    public static void flatten(Node root) {
        // code here
        toLL(root);
    }
}