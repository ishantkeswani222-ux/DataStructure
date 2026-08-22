package LinkedList;


public class LinkedListBasics {
    // Node class
    static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    // display method
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    // length method
    static int Length(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;

    }
    //  display recursively
    public static void displayRec(Node head){
        Node temp  = head;
        if(temp==null) return;
        System.out.println(temp.val);
        displayRec(temp.next);
    }

     static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        // Linking to make a list
        a.next = b; //5 -> 10
        b.next = c; // 5 -> 10 -> 15
        c.next = d; // 5 -> 10 -> 15 -> 20
         // display method
        display(a);
        // length method
         System.out.println();
         int length = Length(a);
//         System.out.print("length of list is "+" "+length);
//         null pointer exception
//         Node n = null;
//         System.out.println(n.val); // these both will give null pointer exception
//         System.out.println(n.next);

    }
}
