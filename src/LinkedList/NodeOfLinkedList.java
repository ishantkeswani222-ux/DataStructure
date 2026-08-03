package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class NodeOfLinkedList {
    static void main(String[] args) {
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);
        // linking of linked List
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
    }
}
