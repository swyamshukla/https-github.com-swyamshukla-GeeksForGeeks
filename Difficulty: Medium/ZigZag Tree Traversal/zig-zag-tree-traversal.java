/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        
        ArrayList<Integer> result= new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size= q.size();
            ArrayList<Integer> hold = new ArrayList<>();
            for(int i=0;i<size;i++){
                
                Node temp =q.remove();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                hold.add(temp.data);
            }
            if(level%2!=0) {
                Collections.reverse(hold);
                result.addAll(hold);
            }
            else{
                result.addAll(hold);
            }
            level++;
        }
        
        return result;
        
    }
}