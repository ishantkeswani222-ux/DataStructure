package LinkedList;

public class LinkedListFunctions {
    // Node class
   public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    // Linked list class
     public static class Linkedlist {
        Node head = null; //by default it is also null in java
        Node tail = null;
        //insert at head
        void AddAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head = tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
            }
        }
        // insert at tail
        void AddAtTail(int val){
            Node temp = new Node(val);
            if(head==null){
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }


        }
        // size method
        int Size(){
            int count = 0;
            Node temp = head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
        //insert At index
        void insertAtIndex(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==0){
                AddAtHead(val);
                return;
            } else if (idx<0) {
                System.out.print("wrong index");
                return;

            }
            for (int i = 1; i <=idx-1 ; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        // get value at Index
        int getAtIndex(int idx){
            Node temp  = head;
            for (int i = 1; i <=idx ; i++) {
                temp = temp.next;
            }
            return temp.val;

        }

        // display method
        void display(){
            Node temp = head;
            if(head==null) return;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
    static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.AddAtTail(4); //4
        ll.display();
        ll.AddAtTail(5); // 4 -> 5
        ll.display();
        ll.AddAtTail(12); //  4 -> 5 -> 12
        ll.display();
        ll.AddAtHead(13); // 13 -> 4 -> 5 -> 12
        ll.display();
        ll.insertAtIndex(2,10); // 13 -> 4 -> 10 -> 5 12
        ll.display();
        // value at any index
        System.out.print("The value at index is "+" "+ll.getAtIndex(3));


    }
}
