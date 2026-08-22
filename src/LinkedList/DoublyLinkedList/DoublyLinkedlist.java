package LinkedList.DoublyLinkedList;

public class DoublyLinkedlist {
    public static class Node {
        Node prev;
        Node next;
        int val;
        Node(int val){
            this.val = val;
        }

    }

   public static class Dll {
        Node head;
        Node tail;
        int size;
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null) head = tail = temp;
            else {
                temp.next = head;
                head.prev = temp;
                head = temp;

            }
            size++;

        }
        void insertAtTail(int val){
            Node temp = new Node(val);
            if(head==null) head = tail = temp;
            else{
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            size++;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void displayReverse(){
            Node temp = tail;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.prev;
            }
            System.out.println();
        }
        void deleteAtHead(){
            if(size==0) {
                System.out.println("list is empty!");
                return;
            }
            if(size==1)
                head = tail = null;
            else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }
        void deleteAtTail(){
            if(size==0){
                System.out.println("list is empty");
                return;
            }
            if(size==1)
                head = tail = null;
            else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }
        void insertAtIndex(int idx,int val){
            Node a = new Node(val);
            Node temp  = head;
            if(idx<0){
                System.out.println("invalid index");
            }
            if(idx==0){
                insertAtHead(val);
            }
            if(idx==size){
                insertAtTail(val);
            }
            for (int i = 1; i <=idx-1; i++) {
                temp = temp.next;
            }
            a.prev = temp;
            temp.next  = a;
            a.next = temp.next;
            a.next.prev = a;
            size++;
        }

    }
    static void main(String[] args) {
        Dll list = new Dll();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.display();
        list.insertAtTail(90);
        list.display();
        list.displayReverse();
        list.deleteAtHead();
        list.display();
        list.deleteAtTail();
        list.display();


    }
}
