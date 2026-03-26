/*Complete the function below
Node is as follows:
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class GfG {
    // Return True if the given Binary Tree is a Full Binary Tree. Else return False
    
    static boolean checkBinaryTree(Node node){
        if(node==null) return true;
        if(node.left==null && node.right==null) return true; //leaf node
        if(node.left==null || node.right ==null )return false;
        
        return checkBinaryTree(node.left) &&  checkBinaryTree(node.right);
    }
    
    boolean isFullTree(Node node) {
        // add code here.
        return checkBinaryTree(node);
    }
}