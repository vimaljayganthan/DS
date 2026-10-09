import java.util.Scanner;

public class SLL {

  public static void main() {

    SLLImplementation ll = new SLLImplementation();

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int data = sc.nextInt();
      ll.insertAtEnd(data);
    }

    ll.display();
    ll.insertAtStart(0);
    ll.display();
    sc.close();
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

  // Insert at End
  public void insertAtEnd(int data) {
    Node newNode = new Node(data);

    // case-1 List is Empty
    if (head == null) {
      head = newNode;
      return;
    }

    // Case-2 List contains some elements
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

  public void display() {
    if (head == null) {
      System.out.println("List is Empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }
}