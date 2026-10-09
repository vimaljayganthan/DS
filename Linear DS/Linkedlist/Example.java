import java.util.Scanner;

public class Example {
  public static void main(String[] args) {

    SLLImplementation ll = new SLLImplementation();

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no.of Elements: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int data = sc.nextInt();
      ll.insertAtEnd(data);
    }
    ll.display(n);
    ll.insertAtStart(0);
    ll.display(n);
    ll.insertAtMiddle(10);
    ll.display(n);
    sc.close();
    ll.deleteAtStart(n);
    ll.display(n);
    ll.deleteAtEnd(n);
    ll.display(n);
    
  }
}

// Node Structure
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

  // Insert at End
  public void insertAtEnd(int data) {
    Node newNode = new Node(data);

    // Case-1 : No Elements in the List
    if (head == null) {
      head = newNode;
      return;
    }

    // Case-2 : List contains some elements
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
  }

  // Insert at Start
  public void insertAtStart(int data) {
    Node newNode = new Node(data);

    newNode.next = head;
    head = newNode;
  }

  // Insert at Middle
  public void insertAtMiddle(int data) {
     Node newNode = new Node(data);

    Node fast = head;
    Node slow = head;

    // Insertion in Second Middle
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    newNode.next = slow.next;
    slow.next = newNode;

    // Case-1 List contains no elements
    if (head == null) {
      head = newNode;
      return;
    }
    // Case-2 List contains some elements
    if (head.next == null) {
      head.next = newNode;
      return;
    }
  }
  // Deletion At Start
  public void deleteAtStart(int data){

    //Case-1 If List is Empty
    if(head == null){
      System.out.println("Deletion impossible, Because, List is empty");
      return;
    }

    //Case-2 List Contains some Elements
    head = head.next;
  
  }

  // Deletion At End
  public void deleteAtEnd(int data){

    Node temp = head;
    while(temp.next.next != null){
      temp = temp.next;
    }
    temp.next = null;

    //Case-1 If List is Empty
    if(head == null){
      System.out.println("Deletion impossible, Because, List is empty");
    }

    //Case-2 If List Contains some Elements
    if(head.next == null){
      head = null;
    }
  }
  
  // Display Method
  public void display(int data) {
    // Case-1 List is empty
    if (head == null) {
      System.out.println("List is Empty");
    }

    // Case-2 List contains some elements
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }
}