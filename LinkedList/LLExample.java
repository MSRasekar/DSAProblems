

public class LLExample {

    Node head ;
    // node class for structure of singly linked list
    class Node {
        public int data;
        public Node next;

        public Node(int val) {
            data = val;
            next = null;
        }
    }

    void addAtFirst(int val){

        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;

        System.out.println("data : "+ newNode.data);
    }

    public static void main(String[] args) {

        LLExample ll = new LLExample();

        ll.addAtFirst(20);


    }
}
