// Node.java
public class Node {
    int data;       // Stores the data for this node
    Node next;      // Points to the next node in the list

    // Constructor to create a new node with given data
    public Node(int data) {
        this.data = data;
        this.next = null;  // Initially, the next node is null
    }
}