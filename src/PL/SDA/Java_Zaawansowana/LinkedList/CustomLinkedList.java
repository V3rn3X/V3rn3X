package PL.SDA.Java_Zaawansowana.LinkedList;

/*
- Adding an element to the list
- Adding element at the start of the list
- Adding an element at some particular index of the list
- Deleting an element from a particular index
- Showing the List
 */


public class CustomLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node newNode = new Node(data);

            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
    }

    public void show() {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("Linked list is empty");
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    }
}
