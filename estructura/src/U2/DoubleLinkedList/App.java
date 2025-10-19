package U2.DoubleLinkedList;
public class App {
    public static void main(String[] args) throws Exception {
        DoublelinkedList list = new DoublelinkedList();
        list.printForward();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Lista original:");
        list.printForward();

        System.out.println("\nEliminando 1");
        list.remove(1);
        list.printForward();

        System.out.println("\nEliminando 4");
        list.remove(4);
        list.printForward();

        System.out.println("\nEliminando 6");
        list.remove(6);
        list.printForward();

        System.out.println("----------Imprimir backward----------");
        list.printBackward();
    }
}
