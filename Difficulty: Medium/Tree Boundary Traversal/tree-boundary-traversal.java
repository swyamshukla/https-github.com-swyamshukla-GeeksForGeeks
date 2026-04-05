
class Solution {
    
    static void addLeftTree(Node root,ArrayList<Integer> result){
        if(root==null) return;
        if(root.left ==null && root.right==null){
            // System.out.println("hello"+root.data);
            return;
        }
         result.add(root.data);


        if(root.left!=null){
            addLeftTree(root.left,result);
        }
        else{
            addLeftTree(root.right,result);
        }
    }
    
    static void addLeaf(Node root,ArrayList<Integer> result ){
        if(root==null) return;
        if(root.left==null && root.right==null){
            result.add(root.data);
        }
        addLeaf(root.left,result);
        addLeaf(root.right,result);
    }
    
    static void addRightTree(Node root,ArrayList<Integer> hold){
        if(root ==null) return;
         if(root.left ==null && root.right==null){
            // System.out.println("hello"+root.data);
            return;
        }
        hold.add(root.data);
        
        if(root.right!=null){
            addRightTree(root.right,hold);
        }
        else{
            addRightTree(root.left,hold);
        }
        
    }
    
    
        
    
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if(root.left==null && root.right==null){
            result.add(root.data);
            return result;
        }
        // Stack<Node> stack = new Stack<>();
        
        result.add(root.data);
        addLeftTree(root.left,result);
        addLeaf(root,result);
        // System.out.println(result);
        
        
        
        ArrayList<Integer> hold = new ArrayList<>();
        
        addRightTree(root.right,hold);

        for(int i=hold.size()-1;i>=0;i--){
            result.add(hold.get(i));
        }
        
        
        
        return result;
        

    }
}

