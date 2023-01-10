import java.util.Scanner;

/* ========== Binray Tree Implementation by Linked List ========== */

public class BinrayTreeEx {

    public static Node createBT(){

        int data;
        Scanner sc = new Scanner(System.in);
        // root node created and have null initially
        Node root = null;

        // get user input for data
        System.out.print(" : Enter Data: ");
        data = sc.nextInt();
        
        if ( data == -1 ){
            return null;
        }
        
        // data assigning to root node
        root= new Node(data);
        System.out.print("Enter for Left Child of root "+ root.data);
        root.left = createBT();
        System.out.print("Enter for Right Child of root "+ root.data);
        root.right = createBT();
        
        return root;
    }

    // Tree Traversal Alogrithms...
    // 1. Inorder : here order is Left, Root, Right (LNR)
    public void inorder(Node root){
        
        // corner case
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // 2. Preorder : here order is Root, Left, Right (NLR)
    public void preorder(Node root){

        // corner case
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // 3. postorder : here order is Left, Right, Root (LRN)
    public void postorder(Node root){

        // corner case
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        
        BinrayTreeEx bt = new BinrayTreeEx();

        Node root = createBT();

        System.out.println("\nInorder Traversal..");
        bt.inorder(root);

        System.out.println("\nPreorder Traversal..");

        bt.preorder(root);
        System.out.println("\nPostorder Traversal..");
        bt.postorder(root);
    }
}

    // LL node class creation
    class Node{

        public int data; 
        public Node left;
        public Node right;

        public Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }