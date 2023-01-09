/* ********** SINGULAR LINKED LIST *********** */
// properties of linked list are as follows..
// while we add any node --> time complexcity --> O(1)
// while we retrive/search any node --> time complexcity --> O(n)
// i.e. Linked List is suitable for frequently addition of data..

public class LLExample {

    // head instance is created
    Node head;
    private int size;
    // node class for structure of linked list
    public class Node {
        public int data;
        public Node next;

        public Node(int val) {
            data = val;
            next = null;
        }
    }

    /*
     * Major operation in LL are
     * 1. Add Node, 2. delete Node, 3. Print LL , 4. Size check
     */

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
        Node temp = head;

        Node newNode = new Node(val);

        size++;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
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
    public void deleteFirst() {
        // corner case
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        // we can make next node of head as head..
        // so head node will be delete
        head = head.next;

    }

    // delete node form last..
    // create two pointers last and second last...
    // traverse upto last and delete last node.
    public Node deleteLast() {
        // corner cases
        if (isEmpty()) {
            System.out.println("List is Empty");
            return head;
        }

        size--;
        // second corner case .. if head.next is null so 
        // while checking last.next we will get error to avoid this.. below condition is checked
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

    // method to print linked list
    public void printList() {
        Node temp = head;

        if (isEmpty()) {
            System.out.println("Printed Empty List");
            return;
        }
        // System.out.print(head.data + " -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {

        LLExample ll = new LLExample();
        ll.printList();
        ll.addNodeAtFirst(20);
        ll.addNodeAtFirst(30);
        ll.addNodeAtLast(40);
        ll.addNodeAtFirst(60);
        ll.addNodeAtLast(50);
        ll.printList();
        System.out.println("Size of LL is : "+ll.getSize());
        ll.deleteFirst();
        ll.printList();
        ll.deleteLast();
        ll.printList();
        
        System.out.println("Size of LL is : "+ll.getSize());
    }
}
