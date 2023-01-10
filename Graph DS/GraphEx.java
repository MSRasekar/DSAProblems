
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.naming.ldap.SortControl;

/* In this Graph Implementation we have use Adjancency List method...
 * in this method
 * 1. one array is created for store each vertices
 * 2. for each vertices we create Linked List which store adjacent node/vertices address 
 */
public class GraphEx {

    // Linked List is defined of variable as array
    private LinkedList<Integer> Adjacancy[];

    // constructor for creating Adjacancy array for each vertex
    public GraphEx(int v) {
        Adjacancy = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            // array is created and for each vertex a Linked list is assign..
            Adjacancy[i] = new LinkedList<Integer>();
        }
    }

    // this method add source and destination for egde in linked list
    public void insertEdge(int s, int d) {
        Adjacancy[s].add(s);
        Adjacancy[d].add(d);
    }

    // Breadth First Search Alogorithm for Graph Traversal
    void BreadthFirstSearch(int source) {
        // boolean array to store visited nodes.. if visited make them true..
        boolean visited[] = new boolean[Adjacancy.length];

        // integer type (depends on graph vertex datatype) array for updating parent
        // node
        int parent[] = new int[Adjacancy.length];

        // Queue for managing traversal..
        // after printing of vertex value will be dequeue from queue
        Queue<Integer> q = new LinkedList<>();

        // 1st add source node to queue
        q.add(source);

        // add source node to parent array and make true in visited array
        visited[source] = true;
        parent[source] = -1;

        // traverse untill queue is empty
        while (!q.isEmpty()) {
            // dequeue source from queue and print it.
            int p = q.poll();
            System.out.print(p + " ");

            for (int i = 0; i < Adjacancy.length; i++) {
                // if any node not visited yet
                // update their status as true and add in queue also in parent..
                if (visited[i] != true) {
                    visited[i] = true;
                    q.add(i);
                    parent[i] = p;
                }
            }
        }

    }

    // Depth First Search Alogorithm for Graph Traversal
    void DepthFirstSearch(int source) {
        boolean visited[] = new boolean[Adjacancy.length];

        int parent[] = new int[Adjacancy.length];

        Stack<Integer> stack = new Stack<>();

        stack.push(source);

        visited[source] = true;
        parent[source] = -1;

        while (!stack.isEmpty()) {
            int p = stack.pop();
            System.out.print(p + " ");

            for (int i = 0; i < Adjacancy.length; i++) {
                if (visited[i] != true) {
                    visited[i] = true;
                    stack.push(i);
                    parent[i] = p;
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v = 0, e = 0;
        int s = 0, d = 0;
        System.out.print("Enter no of Vertices: ");
        v = sc.nextInt();
        System.out.print("Enter no of Edges: ");
        e = sc.nextInt();

        // instance of graph is create
        GraphEx gr = new GraphEx(v);

        // here we get input for source and destination for each edge
        for (int i = 0; i < e; i++) {
            System.out.println("Enter Source and Destination for Edge: " + i);
            s = sc.nextInt();
            d = sc.nextInt();
            gr.insertEdge(s, d);
        }

        System.out.print("\nEnter Source Vertex: ");
        int source = sc.nextInt();
        System.out.println("\nBFS Traversal: ");
        gr.BreadthFirstSearch(source);
        System.out.println("\nDFS Traversal: ");
        gr.DepthFirstSearch(source);
    }
}
