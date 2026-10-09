import java.util.*;
public class BalancingParentheses{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        System.out.println("Enter Expression");
        String exp = sc.nextLine();
        System.out.println(s.validParenthesesChecker(exp));    
        sc.close();    
    }
}
class Node{
    char data;
    Node next;
    Node(char data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    Node top=null;
    public void push(char data){
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

    public char peek(){
        if(isEmpty()){
            System.out.println("Peek Not Possible");
            return '\0';
        }
        return top.data;
    }

    public boolean isValidOpenSymbol(char c){
        return c=='{' || c=='[' || c=='(';
    }

    public boolean isValidCloseSymbol(char c){
        return c=='}' || c==']' || c==')';
    }

    public boolean isMatching(char ch , char peek){
        return ch==')' && peek =='(' || ch=='}' && peek =='{'  || ch==']' && peek =='['; 
    }
    public boolean validParenthesesChecker(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isValidOpenSymbol(ch)) push(ch);
            if(isValidCloseSymbol(ch)){
                if(isEmpty()) {
                    return false;
                }
                else if(isMatching(ch, peek())){
                    pop();
                }
                else break;
            }            
        }
        return isEmpty();
    }
}