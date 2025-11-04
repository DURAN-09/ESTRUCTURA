package U2.linked_list;

public class Main {
    public static void main(String[] args) {
        DynamicLinkedList list = new DynamicLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("Original: ");
        list.printList();
        DynamicLinkedList.SplitResult result = list.splitEvenOdd();
        System.out.print("Pares: ");
        result.evenList.printList();
        System.out.print("Impares: ");
        result.oddList.printList();
    }
}
