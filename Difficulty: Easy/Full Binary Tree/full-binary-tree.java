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
        static boolean check(Node node){
            if(node==null) return true;
            if(node.left==null && node.right==null) return true;
            if(node.left==null || node.right==null) return false;
            
            return check(node.left) && check(node.right);
        }
    
    boolean isFullTree(Node node) {
        // add code here.
        return check(node);
    }
}