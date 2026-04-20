// User function Template for Java

/*class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Solution {
    
    static void inorder(Node root,List<Integer> list ){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    
    static void construct(List<Integer> list, int left,int right){
        
        if(left< 0 || right>=list.size()-1) return;
        int max = list.get(right);
        int mid = (left+right)/2;
        list.remove(right);
        list.add(mid,max);
        construct(list,left,mid-1);
        construct(list,mid+1,right);
    }
    static void build(Node root,List<Integer> list){
        if(root==null) return;
        build(root.left,list);

        build(root.right,list);
                root.data= list.remove(0);
    }

    public static void convertToMaxHeapUtil(Node root) {
        // code 
        
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        
        construct(list,0,list.size()-1);
        // System.out.println(list);
        build(root,list);
        
    }
}