package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class
Linkedlist {
    Node head;
    Node tail;
    public void AddAtTail(int val){
        Node temp = new Node(val);
        if(head==null){
            head =tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
    }
    public void display(){
        //if(head == null) return;
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

}
public class InsertAtTail {
    static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.AddAtTail(5);
        ll.AddAtTail(20);
        ll.AddAtTail(30);
        ll.AddAtTail(40);
        ll.display();


    }
}
