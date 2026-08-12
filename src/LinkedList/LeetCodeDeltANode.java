package LinkedList;
// Node is itself a parameter

public class LeetCodeDeltANode {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void delete(Node node){
         node.val = node.next.val;
         node.next = node.next.next;

    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        // Linking
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        display(a);
        delete(c);
        display(a);


    }
}
