package U2.ArrayQueue;

public class App {
    public static void main(String[] args) {
        ArrayQueue<Customer> queue = new ArrayQueue<>(10);

        queue.enqueue(new Customer(1, "Ana"));
        queue.enqueue(new Customer(2, "Luis"));
        queue.enqueue(new Customer(3, "Maya"));

        System.out.println("Antes de invertir:");
        System.out.println(queue);
        int before = queue.size();

        queue.reverse();

        System.out.println("Después de invertir:");
        System.out.println(queue);
        int after = queue.size();

        System.out.println("Elementos antes = " + before + ", elementos después = " + after);
    }
}
