public class DLL{
  public static void main(String[] args) {
    DLLImplementation ll = new DLLImplementation();

    ll.insertAtStart(10);
    ll.insertAtMiddle(20);
    ll.insertAtEnd(30);
    ll.displayForward();
    ll.displayBackward();
    ll.insertAtEnd(40);
    ll.insertAtEnd(50);
    ll.deleteAtStart(10);
    ll.deleteAtMiddle(30);
    ll.displayBackward();
    ll.displayForward();
  
   }

}
class Node{
  int data;
  Node prev;
  Node next;
  Node(int data){
    this.data=data;
    this.prev=null;
    this.next=null;
  }
}

class DLLImplementation{
  Node head = null;
 
  public void insertAtStart(int data){

    Node newNode = new Node(data);
    //Case-1 List is Empty (Method - 1)
    if(head==null){
      head = newNode;
      return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;

    //(Method - 2)
    newNode.next = head;
    if(head!=null){
      head.prev = newNode;
    }
    head = newNode;
  }

  public void insertAtMiddle(int data){

    Node newNode = new Node(data);

    //Case - 1 List is Empty
    if(head==null){
      head = newNode;
      return;
    }

    //Case - 2 List contains only one Element
    if(head.next==null){
      head.next = newNode;
      newNode.prev = head;
      return;
    }

    //Case - 3 List contains many Elements
    Node fast = head;
    Node slow = head;
    while(fast.next!=null && fast.next.next!=null){
      fast = fast.next.next;
      slow = slow.next;
    }
    newNode.next = slow.next;
    newNode.prev = slow;
    slow.next.prev = newNode;
    slow.next = newNode;
  }

public void insertAtEnd(int data){
  
  Node newnode = new Node(data);
  //Case-1 List is Empty
  if(head==null){
    head=newnode;
    return; 
  }
  //Case-2 Lsit contains elements
  Node temp=head;
  while(temp.next!=null){
    temp=temp.next;
  }
  temp.next=newnode;
  newnode.prev=temp;

}

public void deleteAtStart(int data){
  //Case-1 List is Empty
  if(head==null){
    System.out.println("Deletion is impossible, beacause list is empty");
    return;
  }
  //Case-2 List contains some nodes
  head = head.next;
  if(head!=null){
    head.prev = null;
  }

}

public void deleteAtMiddle(int data){
  //Case-1: List is Empty
  if(head==null){
    System.out.println("Deletion is impossible, because, list is empty");
    return;
  }
  //Case-2: List Contains only one Elements
  if(head.next==null){
    head=null;
    return;
  }
  //Case-3: List Contains only 2 Elements
  if(head.next.next==null){
    head.next=null;
    return;
  }
  //Case-4: List Contains Some Elements(more than 2)
  Node fast = head;
  Node slow = head;
  while(fast.next!=null && fast.next.next!=null){
    fast=fast.next.next;
    slow=slow.next;
  }
}
public void displayForward(){

  Node temp=head;

  if(head==null){
    System.out.println("List is Empty");
    return;
  }

  while(temp!=null){
    System.out.print(temp.data+"<->");
    temp=temp.next;
  }
  System.out.print("null");
  System.out.println();
}

public void displayBackward(){
  Node temp=head;
  while(temp.next!=null){
    temp=temp.next;
  }
  while(temp!=null){
    System.out.print(temp.data+"<->");
    temp=temp.prev;
  }
  System.out.print("null");
  System.out.println();
}
}