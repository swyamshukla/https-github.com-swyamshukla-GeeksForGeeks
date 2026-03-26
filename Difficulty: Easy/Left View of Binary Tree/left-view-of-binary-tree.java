/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/




class Solution {
 

    public ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> result = new ArrayList<>();

        Queue<Node> q = new ArrayDeque<>();
        if(root==null) return result;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                Node temp = q.remove();
                if(temp.left!=null)  q.add(temp.left);
                if(temp.right!=null)  q.add(temp.right);
                if(i==0) {
                    result.add(temp.data);
                }
            }

        }
        return result;

    }
}