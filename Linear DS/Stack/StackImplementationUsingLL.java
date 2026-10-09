public class StackImplementationUsingLL {
    public static void main(String[] args){
        MyStack ms=new MyStack();
        ms.push('A');
        ms.push(20);
        ms.push(30);
        ms.push(40);
        ms.push(50);
        ms.display();
        ms.pop();
        ms.display();
        ms.peek();
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
class MyStack{
    Node top=null;
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next=top;
        top=newNode;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        top=top.next;
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Peek Not Possible");
            return;
        }
        System.out.println(top.data);
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}