/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> preOrder(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Node> stack= new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            arr.add(temp.data);
           if(temp.right!=null) stack.push(temp.right);
           if(temp.left!=null) stack.push(temp.left);
            
        }
        return arr;
    }
}