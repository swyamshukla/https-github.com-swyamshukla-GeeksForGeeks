/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        Node temp = head;
        if(head==null) return newNode;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
        
    }
}