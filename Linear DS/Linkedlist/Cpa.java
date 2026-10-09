import java.util.*;

class Cpa {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        // Create linked list
        for (int i = 0; i < n; i++) {

            Node newNode = new Node(sc.nextInt());

            if (head == null) {
                head = newNode;
                tail = newNode;
            } 
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Store doubled values
        Node temp = head;

        int[] result = new int[3];
        int j = 0;

        while (temp != null && j < 3) {

            result[j] = temp.data * 2;

            j++;
            temp = temp.next;
        }

        // Process the values
        int r1 = result[1] / 10;

        System.out.print(result[0] + (r1 % 10) + " ");

        int r2 = result[2] / 10;

        System.out.print(result[1] % 10 + (r2 % 10) + " ");

        System.out.print(result[2] % 10);
    }
}
