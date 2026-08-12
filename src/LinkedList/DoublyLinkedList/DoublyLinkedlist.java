package LinkedList.DoublyLinkedList;

public class DoublyLinkedlist {
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayRev(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void displayRandom(Node random){ //random node is given
        Node temp = random;
        //we have to move backwards to the head
        while (temp.prev != null){
            temp = temp.prev;
        }
        // Now we are on head node we will simply print the list
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node {
        Node prev;
        Node next;
        int val;
        Node(int val){
            this.val = val;
        }

    }
    static void main(String[] args) {
        //4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        // linking
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        display(a);
        displayRev(e);
        displayRandom(c);



    }
}
