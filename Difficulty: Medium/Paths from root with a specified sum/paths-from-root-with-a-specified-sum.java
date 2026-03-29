// User function Template for Java

/*Tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    
    static void paths(Node root, int sum, int curr, ArrayList<ArrayList<Integer>> result,ArrayList<Integer> temp ){
        if(root==null) return;
        curr+=root.data;
        temp.add(root.data);
        if(curr==sum) result.add(new ArrayList<>(temp));

        paths(root.left,sum,curr,result,temp);
        paths(root.right,sum,curr,result,temp);
        temp.remove(temp.size()-1);
        curr-=root.data;
    }
    
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        // code here
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            ArrayList<Integer> temp = new ArrayList<>();
        paths(root,sum,0,result,temp);
        return result;
    }
}