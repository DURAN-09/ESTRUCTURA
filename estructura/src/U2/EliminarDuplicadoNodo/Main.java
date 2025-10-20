package U2.EliminarDuplicadoNodo;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(9);

        System.out.println("Lista original:");
        EliminarDuplicado.printList(head);

        head = EliminarDuplicado.eliminar(head);

        System.out.println("Lista sin duplicados:");
        EliminarDuplicado.printList(head);
    }
}
