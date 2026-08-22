package LinkedList;
//Question
//Given the head of a singly linked list, return the middle node of the linked list.
//If there are odd number of nodes → return the exact middle.
//If there are even number of nodes → return the second middle node.

public class MiddleOfLinkedList {
    static class Node {
        int val;
        Node next;
        Node(int val){
            this.val  = val;
        }
    }
    public static int middleNode(Node head){
        Node temp = head;
        int length = 0;
        while (temp!= null){
            temp = temp.next;
            length++;
        }
        temp = head;
        for (int i = 1; i <=length/2; i++) {
            temp = temp.next;
        }
        return temp.val;
    }


    static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(4);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(10);

        a.next = b; b.next = c; c.next = d; d.next = e;
        // middle of linked list
        System.out.println(middleNode(a));


    }
}
