/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    
    boolean check(Node head,int key){
        if(head==null) return false;
        if(head.data==key) return true;
        return check(head.next,key);
    }
    
    public boolean searchKey(Node head, int key) {
        // Code here
        return check(head,key);
    }
}