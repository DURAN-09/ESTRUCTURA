package U2.linked_list;

public class Main {
    public static void main(String[] args) {
        DynamicLinkedList list = new DynamicLinkedList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
        int ocurrencias = list.countOccurrences(2);
        System.out.println("Ocurrencias de 2 = " + ocurrencias);
    }
}

