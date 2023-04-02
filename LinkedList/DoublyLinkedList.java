import java.util.Scanner;

public class DoublyLinkedList{
    
    Node head;
    private int size;

    // node class for structure of linked list
    public class Node {
        public int data;
        public Node prev;
        public Node next;

        public Node(int val) {
            this.data = val;
            this.prev = null;
            this.next = null;
        
        }
    }

    // add node at first position
    public void addNodeAtFirst(int val) {

        Node newNode = new Node(val);

        size++;
        // if list is empty we need assign newNode as head.
        if (isEmpty()) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add node at last position
    public void addNodeAtLast(int val) {
        // Never perfome any manipulation operation on head node.. create any node ad
        // assign head to that node to preserve head of LL..
        Node newNode = new Node(val);

        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node temp = head;
        size++;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // add node at specific postition..
    public void addNodeAtPosition(int val) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Position for Adding a Node");
        int position = sc.nextInt();

        Node newNode = new Node(val);

        Node temp = head;
        size++;
        if (isEmpty()) {
            head = newNode;
            return;
        } else {
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
            temp.next.prev = newNode;
        }
    }

    // method to check that is list empty or not
    public boolean isEmpty() {

        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    // delete node form first/start
    public void deleteFromFirst() {
        // corner case
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        // we can make next node of head as head..
        // so head node will be delete
        head = head.next;
        head.prev = null;

    }

    // delete node form last..
    // create two pointers last and second last...
    // traverse upto last and delete last node.
    public Node deleteFromLast() {
        // corner cases
        if (isEmpty()) {
            System.out.println("List is Empty");
            return head;
        }

        size--;
        // second corner case .. if head.next is null so
        // while checking last.next we will get error to avoid this.. below condition is
        // checked
        if (head.next == null) {
            head = null;
            return head;
        }
        // two pointers
        Node secondLastNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        // deletion operation
        secondLastNode.next = null;
        return lastNode;
    }

    public void deleteFromPosition() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Position for Delete Node..");
        int position = sc.nextInt();
        
        size--;

        Node temp = head;
        Node ptr = head.next;
        if (isEmpty()) {
            System.out.println("List is Empty..");
            return;
        } else {
            for (int i = 0; i < position - 1; i++) {
                temp = ptr;
                ptr = ptr.next;
            }
        }
        temp.next = ptr.next;
        ptr.next.prev = temp;
    }

    // method to print linked list
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

    public int getSize() {
        return size;
    }

    public static void Menu() {

        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        int choice = 0, val;
        System.out.println(" ***** Welcome to Doubly Linked List Program ***** \n");

        do {
            System.out.println(
                    "\nPlease Select an option for further operations..\n1. Add Node , 2. Delete Node, 3. Print Linked List, 4. Get Size of LL & 5. For Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(
                            "\nChoose Method to Add\n1. Add at First, 2. Add at Last, 3. Add At Sepcitfic Position..\n");
                    int key = sc.nextInt();
                    System.out.print("Enter Value to Add: ");
                    val = sc.nextInt();
                    switch (key) {
                        case 1:
                            dll.addNodeAtFirst(val);
                            break;
                        case 2:
                            dll.addNodeAtLast(val);
                            break;
                        case 3:
                            dll.addNodeAtPosition(val);
                            break;
                        default:
                            System.out.println("\nInvalid Option!!!\n");
                    }

                    break;
                case 2:
                    System.out.println(
                            "Choose Method to Add\n1. Delete from First, 2. Delete from Last, 3. Delete form Sepcitfic Position..\n");
                    int key1 = sc.nextInt();
                    switch (key1) {
                        case 1:
                            dll.deleteFromFirst();
                            break;
                        case 2:
                            dll.deleteFromLast();
                            break;
                        case 3:
                            dll.deleteFromPosition();
                            break;
                        default:
                            System.out.println("\nInvalid Option!!!\n");
                    }
                    break;
                case 3:
                    System.out.println("The Linked List as follows..");
                    dll.printList();
                    break;
                case 4:
                    System.out.println("Size of Linked list is: " + dll.getSize());
                    break;
                case 5:
                    System.out.println("Thank You For Using...");
                    break;
                default:
                    System.out.println("!!!! Please Select Valid Option !!!");
                    break;
            }
        } while (!(choice == 5));

    }

    public static void main(String[] args) {

        Menu();
    }

    
}