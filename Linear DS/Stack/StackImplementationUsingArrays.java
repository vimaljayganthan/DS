public class StackImplementationUsingArrays {

    static class Stack {
        int size;
        int[] myStack;
        int top;

        Stack(int size) {
            this.size = size;
            this.myStack = new int[size];
            this.top = -1;
        }

        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }

            myStack[++top] = data;
            System.out.println("pushed "+data);
        }

        public void pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return;
            }

            System.out.println("popped "+myStack[top]);
            top--;
        }

        public void peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }

            System.out.println("Top element: " + myStack[top]);
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }

            System.out.println("Stack elements:");

            for (int i = top; i >= 0; i--) {
                System.out.println(myStack[i]);
            }
        }

        public boolean isFull() {
            return top == size - 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        s.pop();

        s.peek();

        s.display();
    }
}