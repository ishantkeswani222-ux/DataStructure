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
        Node head = null; //by default, it is also null in java
        Node tail = null;
        int size; ;

        void AddAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head = tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
                size++;
            }
        }
        void AddAtTail(int val){
            Node temp = new Node(val);
            if(head==null){
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
                size++;
            }


        }
        int Size(){
            int count = 0;
            Node temp = head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
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
            size++;
        }
        int getAtIndex(int idx){
            Node temp  = head;
            for (int i = 1; i <=idx ; i++) {
                temp = temp.next;
            }
            return temp.val;

        }
        void display(){
            Node temp = head;
            if(head==null) return;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void deleteAtHead(){
            if(head==null){
                System.out.println("List Is Empty!!!");
            }
            else {
                head = head.next;
            }
            if(head==null) {// this is for 1 size list
                tail = null;
            }
            size--;
        }
        boolean search(int val){
            Node temp  = head;
            if(head == null) return false;
            while (temp!=null){
                if(temp.val == val) return true;
            }
            return false;
        }
        void deleteAtIndex(int idx){
            Node temp = head;
            if(idx<0 || idx>=size){
                System.out.print("invalid index");
                return;
            }
            if(idx==0) {
                deleteAtHead();
                return;
            }
            for (int i = 1; i <=idx-1 ; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next; // this line is deleting the node
            if(idx == size-1) tail = temp; // deleting tail
            size--;

        }

    }
    static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
         ll.AddAtHead(3);
         ll.AddAtTail(4);
         ll.AddAtHead(5);
         ll.AddAtHead(6);
         ll.AddAtTail(6);
         ll.display();
         ll.deleteAtHead();
         ll.display();
         ll.search(5);



    }
}
