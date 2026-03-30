/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class GfG {
    
    
    boolean isCompleteBT(Node root) {
        // add code here.
        
        // bfs
        ArrayList<Node> arr = new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.remove();
            arr.add(temp);
            if(temp!=null){
             q.add(temp.left);
             q.add(temp.right);
            }


        }
        
        boolean seen =false;
        for(Node ch:arr){
            if(ch!=null && seen){
                return false;
            }
            if(ch==null){
                seen=true;
            }
        }
        return true;
        
        
    }
}