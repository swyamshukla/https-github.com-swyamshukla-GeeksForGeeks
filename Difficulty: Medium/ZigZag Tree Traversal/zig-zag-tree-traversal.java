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
        Deque<Node> q = new ArrayDeque<>();
        
        q.add(root);
        int level=0;
        
        while(!q.isEmpty()){
            int size= q.size();
            ArrayList<Integer> hold = new ArrayList<>();
            for(int i=0;i<size;i++){
                
                if(level%2!=0){
                    Node temp =q.removeLast();
                    if(temp.right!=null) q.addFirst(temp.right);
                    if(temp.left!=null) q.addFirst(temp.left);
                    hold.add(temp.data);                    
                }
                else{
                    Node temp =q.removeFirst();
                    if(temp.left!=null) q.addLast(temp.left);
                    if(temp.right!=null) q.addLast(temp.right);  
                    hold.add(temp.data);
                }


            }
            result.addAll(hold);
            level++;
        }
        
        return result;
        
    }
}