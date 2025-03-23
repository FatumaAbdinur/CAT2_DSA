// LinkedList.java
public class LinkedList {
    private Node head;  // The starting point of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;  // Initially, the list is empty
    }

    // Adds a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);  // Create a new node
        newNode.next = head;            // Point the new node to the current head
        head = newNode;                 // Update the head to the new node
        System.out.println("Adding a node at the beginning of the list with data " + data);
        display();  // Show the updated list
    }

    // Adds a new node at the end of the list
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
            current.next = newNode;  // Link the last node to the new node
        }
        System.out.println("Adding a node at the end of the list with data " + data);
        display();  // Show the updated list
    }

    // Deletes the first node from the list
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            int deletedData = head.data;  // Save the data of the node being deleted
            head = head.next;            // Move the head to the next node
            System.out.println("Deleting a node from the beginning of the list");
            display();  // Show the updated list
        }
    }

    // Displays the entire linked list
    public void display() {
        if (head == null) {
            System.out.println("The elements of the List are:");
            System.out.println("NULL");
        } else {
            Node current = head;
            System.out.println("The elements of the List are:");
            while (current != null) {
                System.out.print(current.data + " -> ");  // Print the current node's data
                current = current.next;                  // Move to the next node
            }
            System.out.println("NULL");  // Indicate the end of the list
        }
    }
}
