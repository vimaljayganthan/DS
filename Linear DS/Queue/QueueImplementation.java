class Queue{
  int queue[];
  int capacity;
  int front;
  int rear;
  Queue(int capacity){
    this.capacity=capacity;
    this.front=-1;
    this.rear=-1;
    this.queue=new int[capacity];
  }

  public boolean isFull(){
    return rear==capacity-1;
  }

  public boolean isEmpty(){
    return front==-1;
  }

  //Inserting in Queue
  public void enQueue(int data){
    //Case-1: Check my queue is full
    if(isFull()){
      System.out.println("Queue is Overflow, no insertion.");
      return;
    }
    //Case-2: Update my front pointer to move 0 state
    if(front==-1){
      front++;
    }
    queue[++rear]=data;
  }

  //Display Peek Value
  public void peek(){
    System.out.println(queue[front]);
  }

  //Deletion in Queue
  public void deQueue(){
    if(isEmpty()){
      System.out.println("DeQueuing is Impossible");
      return;
    }
    if(front==rear){
      front=rear=-1;
    }
    front++;
  }

  public void display(){
    if(isEmpty()){
      System.out.println("Queue is Empty.");
      return;
    }
    for(int i=front;i<=rear;i++){
      System.out.print(queue[i]+" ");
    }
    System.out.println();
  }
}

public class QueueImplementation {
  public static void main(String[] args) {
    Queue q=new Queue(5);
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