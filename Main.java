// Main.java
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert nodes at the beginning
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display();  // Output: 30 -> 20 -> 10 -> null

        // Insert nodes at the end
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.display();  // Output: 30 -> 20 -> 10 -> 40 -> 50 -> null

        // Delete nodes from the beginning
        list.deleteFromBeginning();
        list.display();  // Output: 20 -> 10 -> 40 -> 50 -> null

        list.deleteFromBeginning();
        list.display();  // Output: 10 -> 40 -> 50 -> null
    }
}