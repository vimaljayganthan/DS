class Queue {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    // Constructor
    Queue() {
        front = null;
        rear = null;
    }

    // Check Queue is Empty
    public boolean isEmpty() {
        return front == null;
    }

    // Insertion in Queue
    public void enQueue(int data) {

        Node newNode = new Node(data);

        // Case 1: Queue is Empty
        if (front == null) {
            front = newNode;
            rear = newNode;
            return;
        }

        // Case 2: Insert at Rear
        rear.next = newNode;
        rear = newNode;
    }

    // Display Peek Value
    public void peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.println("Peek Value: " + front.data);
    }

    // Deletion in Queue
    public void deQueue() {

        if (isEmpty()) {
            System.out.println("DeQueuing is Impossible");
            return;
        }

        // Move front to next node
        front = front.next;

        // If Queue becomes empty
        if (front == null) {
            rear = null;
        }
    }

    // Display Queue
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}


public class QueueUsingLinkedList {

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enQueue(100);
        q.enQueue(200);
        q.enQueue(300);
        q.enQueue(400);
        q.enQueue(500);

        q.display();

        q.deQueue();

        q.display();

        q.peek();
    }
}