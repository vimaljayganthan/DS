public class Example2 {

    public static void main(String[] args) {
        SLLImplementation ll = new SLLImplementation();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        ll.display();
        ll.deleteAtMiddle();
        ll.display();
        ll.count();
        ll.search(30);
        
    }
}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SLLImplementation {

    Node head = null;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        //case-1 List is Empty
        if (head == null) {
            head = newNode;
            return;
        }
        //case:2 List contains many nodes
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void display() {
        if (head == null) {
            System.out.println("List isEmpty");
        } else {
            Node temp = head;
            System.out.print("LinkedList : ");
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void insertAtMiddle(int data){
        Node newNode =new Node(data);
        //case-1 List is Empty
        if(head==null){
            head=newNode;
            return;
        }
        //case-2 List contains 1 Node
        if(head.next==null){
            head.next=newNode;
            return;
        }
        //case-3 List contains >=2 Nodes
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        newNode.next=slow.next;
        slow.next=newNode;
    }

    public void deleteAtStart(){
        //case-1 List is empty
        if(head==null){
            System.out.println("Deletion impossible , becasue lis is empty");
            return;
        }
        //case-2 list contains elements 
        head=head.next;

    }

    public void deleteAtEnd(){
        //case-1 List is empty
        if(head==null){
            System.out.println("Deletion impossible , becasue lis is empty");
            return;
        }
        //case-2 List contains one Element 
        if(head.next==null){
            head=null;
            return;
        }
        //case-3 list contains elements 
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void deleteAtMiddle(){
        //case-1 List is empty
        if(head==null){
            System.out.println("Deletion impossible , becasue lis is empty");
            return;
        }

        //case-2 list contains only oneNode
        if(head.next==null){
            head=null;
            return;
        }

        //case-3 List contains two nodes
        if(head.next.next==null){
            head.next=null;
            return;
        }

        //case-4 List contains more than 2 nodes
        Node prev=null;
        Node fast=head;
        Node slow=head;
        while(fast.next!=null && fast.next.next !=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }

        prev.next = slow.next;
    }


    public void count(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Total"+count);
    }

    public void search(int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                System.out.println("treu");
                return;
            }
            temp=temp.next;
        }
        System.out.println("False");
    }
}
