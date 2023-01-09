import java.util.Scanner;

public class ReverseLL {

    Node head;

    // linked list structure is created
    class Node {
        public int data;
        Node next;

        public Node(int val) {
            data = val;
            next = null;
        }
    }

    // add at first
    public void addFirst(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void reverseLinkedList() {
        System.out.println("Reversed Linked List is..");
        // corner case -> check if head is null or not..
        if (head == null || head.next == null) {
            return;
        }
        // initilizing two pointers 
        Node prev = head;
        Node curr = head.next;

        while (curr != null) {

            // third pointer to prevent data loss
            Node temp = curr.next;
            // connecting prev node to curr node next address field
            curr.next = prev; 

            // updating the pointer
            prev = curr;
            curr = temp;
        }
        // updating head pointer..
        head.next = null;
        head = prev;

    }

    public void printList() {
        Node temp = head;

        if (head == null) {
            System.out.println("Empty List Printed.\n head -> null\n");
            return;
        }
        
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null\n");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReverseLL rll = new ReverseLL();

        rll.printList();
        rll.addFirst(40);
        rll.addFirst(50);
        rll.addFirst(60);
        rll.addFirst(70);

        rll.printList();

        rll.reverseLinkedList();

        rll.printList();

    }
}
