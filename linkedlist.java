// LinkedList.java
public class LinkedList {
    private Node head;  // Head of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to insert a node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);  // Create a new node
        newNode.next = head;            // Point the new node to the current head
        head = newNode;                 // Update the head to the new node
        System.out.println("Inserted " + data + " at the beginning.");
    }

    // Method to insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);  // Create a new node

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse to the last node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;  // Point the last node to the new node
        }
        System.out.println("Inserted " + data + " at the end.");
    }

    // Method to delete a node from the beginning of the list
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            int deletedData = head.data;  // Store the data of the node to be deleted
            head = head.next;            // Update the head to the next node
            System.out.println("Deleted " + deletedData + " from the beginning.");
        }
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node current = head;
            System.out.print("Linked List: ");
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}