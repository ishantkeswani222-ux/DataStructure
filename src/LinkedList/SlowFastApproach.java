package LinkedList;

public class SlowFastApproach {
    static class Node {
        int val;
        Node next;
        Node(int val){
            this.val  = val;
        }


    }
    public static int middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next == null){
            slow  = slow.next;
            fast = fast.next.next;
        }
        return slow.val;

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
