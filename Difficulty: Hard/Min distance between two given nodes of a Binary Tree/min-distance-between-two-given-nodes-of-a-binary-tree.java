// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    
    static boolean lca(Node root,int a,ArrayList<Node> list){
        if(root==null) return false;
        list.add(root);
        if(root.data==a) return true;
        
        if(lca(root.left,a,list)|| lca(root.right,a,list)){
            return true;
        }
        list.remove(list.size()-1);
        return false;
        
    }
    
    
    
    int findDist(Node root, int a, int b) {
        ArrayList<Node> aList = new ArrayList<>();
        ArrayList<Node> bList = new ArrayList<>();
        
        lca(root,a,aList);
        lca(root,b,bList);
            
        int size = Math.min(aList.size(), bList.size());
        
        int i=0;
        while(i<size){
            if(aList.get(i)!=bList.get(i)) break;
            i++;
        }
        
        return aList.size()+bList.size()-2*i;
        
        
        
        
        
        
        
        // Your code here
        
    }
}