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
    // chcek for cbt-->
    
    static boolean checkCBT(Node tree,int idx,int size){
        if(tree==null) return true;
        if(idx>=size) return false;
        return checkCBT(tree.left,(2*idx)+1,size) && checkCBT(tree.right,(2*idx)+2,size);
    }
    
    static boolean checkMaxHeap(Node tree){
        if(tree==null) return true;
        if(tree.left!=null && tree.left.data>tree.data) return false;
        if(tree.right!=null && tree.right.data>tree.data) return false;
        return checkMaxHeap(tree.left) && checkMaxHeap(tree.right);
    }
    
    public boolean isHeap(Node tree) {
        // code here
        int size=count(tree);
        return checkCBT(tree,0,size) && checkMaxHeap(tree);
        
    }
}