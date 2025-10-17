package U2.linked_list;

public class DynamicLinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public int countOccurrences(int value) {
        int count = 0;
        Node current = head;

        while (current != null) {
            if (current.data == value) {
                count++;
            }
            current = current.next;
        }

        return count;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
