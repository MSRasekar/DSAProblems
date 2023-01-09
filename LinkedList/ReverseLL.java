
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

    public void reverseLinkedList(){

        Node prev = null;
        Node curr;
        Node temp;
        curr = head;
        temp = head.next;
        
        while(curr.next != null){
            curr.next = temp;
            prev = curr.next;
            prev = curr;
            curr = temp;
        }

        prev.next = null;
        head = curr;
    }

    public void printList() {
        Node temp = head;

        if (head == null) {
            System.out.println("Printed Empty List");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ReverseLL rll = new ReverseLL();


        rll.addFirst(20);
        rll.addFirst(30);
        rll.addFirst(40);

        rll.printList();
        rll.reverseLinkedList();
        rll.printList();

    }
}

