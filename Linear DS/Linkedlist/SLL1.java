import java.util.*;
public class SLL1 {
  public static void main(String[] args) {
    
    
  }

  
}

class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
}

class SLLImplementation{
  Node head = null;

  //Insertion
  //insertAtStart
  public void insertAtStart(int data){
    Node newNode = new Node(data);

    //Case-1: List is Empty
    if(head==null){
      head=newNode;
      return;
    }

    //Case-2: List Contains Elements
    Node temp=head;
    if(temp.next!=null){
      newNode.next=head;
      head=newNode;
    }
  }

    public void insertAtMiddle(int data){
      Node newNode = new Node(data);

      //Case-1: List is Empty
      if(head==null){
        head=newNode;
        return;
      }

      //Case-2: List has 1 Element
      if(head.next==null){
        head.next=newNode;
        return;
      }

      //Case-3: List Contains Some Elements
      Node fast=head;
      Node slow=head;
      while(fast.next!=null && fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
      }
      newNode.next=slow.next;
      slow.next=newNode;


    }

    //insertAtEnd
    public void insertAtEnd(int data){
      Node newNode = new Node(data);

      //Case-1: List is empty
      if(head==null){
        head=newNode;
        return;
      }

      //Case-2: List Contains Some Elements
      Node temp=head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=newNode;

    }

    //Deletion
    //deletionAtStart
    public void deleteAtStart(int data){
      //Case-1: List is Empty
      if(head==null){
        System.out.println("Deletion is Impossible");
        return;
      }

      //Case-2: List Contains Some Elements
      head=head.next;
    }

    //deletionAtMiddle
    public void deleteAtMiddle(int data){
      //Case-1: List is Empty
      if(head==null){
        System.out.println("Deletion is Impossible");
        return;
      }

      //Case-2: List Cointains 1 Element
      if(head.next==null){
        return;
      }

      //Case-3: List Contains 2 Elements
      if(head.next.next==null){
        head.next=null;
        return;
      }

      //Case-4: List Contains More than 2 Elements
      Node fast=head;
      Node slow=head;
      Node prev=head;
      while(fast.next!=null && fast.next.next!=null){
        fast=fast.next.next;
        prev=slow;
        slow=slow.next;
      }
      prev.next=slow.next;
    }

    //deletionAtEnd
    public void deleteAtEnd(int data){
      //Case-1: List is Empty
      if(head==null){
        System.out.println("Deletion is Impossible");
        return;
      }

      //Case-2: List Conatins Some Elements
      Node temp=head;
      while(temp.next.next!=null){
        temp=temp.next;
      }
      temp.next=null;
      
    }
    //Reversing
    public void reverse(int data){

      //Case-1: List is Empty
      if(head==null){
        System.out.println("Reverse Impossible, Since, List is empty");
        return;
      }

      //Case-2: List Contains Some Elements
      Node cur=head;
      Node prev=null;
      Node next=null;
      while(cur!=null){
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
      }
      head=prev;

    }


}

