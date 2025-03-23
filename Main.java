// Main.java
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();  // Create a new linked list

        // Add nodes to the beginning of the list
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);

        // Add nodes to the end of the list
        list.insertAtEnd(8);
        list.insertAtEnd(9);

        // Delete the first node from the list
        list.deleteFromBeginning();
    }
}