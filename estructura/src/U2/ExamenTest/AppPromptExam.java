package U2.ExamenTest;

import U2.ArrayQueue.ArrayQueue;
import U2.ArrayStack.ArrayStack;
import U2.SinglyLinkedList.SinglyLinkedList;

import java.util.Scanner;

public class AppPromptExam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opc;
        String x;
        int i, j = 0;
        boolean res = true;

        ArrayQueue<JobCustom> queue = new ArrayQueue<>();
        ArrayStack<JobCustom> stack = new ArrayStack<>();
        SinglyLinkedList bitacora = new SinglyLinkedList();

        while (res) {
            opc = sc.next().toUpperCase();
            switch (opc) {
                case "ADD":
                    if (!sc.hasNext()) {
                        System.out.println("Falta ID de trabajo");
                        break;
                    }
                    x = sc.next();
                    JobCustom job = new JobCustom(x);
                    queue.offer(job);
                    break;
                case "PROCESS":
                    if (!sc.hasNextInt()) {
                        System.out.println("Número inválido");
                        sc.next();
                        break;
                    }
                    i = sc.nextInt();
                    j = 0;
                    while (!queue.isEmpty() && j < i) {
                        stack.push(queue.poll());
                        j++;
                    }
                    break;
                case "COMMIT":
                    j = 0;
                    int size = stack.size();
                    while (j < size) {
                        bitacora.addLast(stack.pop());
                        j++;
                    }
                    break;
                case "ROLLBACK":
                    if (!sc.hasNextInt()) {
                        System.out.println("Número inválido");
                        sc.next();
                        break;
                    }
                    i = sc.nextInt();
                    if (bitacora.size() == 0) {
                        System.out.println("NADA QUE HACER");
                    } else {
                        j = 0;
                        while (j < i && bitacora.size() > 0) {
                            queue.offerFront(bitacora.removeLast());
                            j++;
                        }
                    }
                    break;
                case "PRINT":
                    printState(queue, stack, bitacora);
                    break;
                case "END":
                    res = false;
                    System.out.println("=== ESTADO FINAL ===");
                    printState(queue, stack, bitacora);
                    break;
                default:
                    System.out.println("Comando no válido");
            }
        }
    }

    private static void printState(ArrayQueue<JobCustom> q, ArrayStack<JobCustom> st, SinglyLinkedList sll) {
        System.out.print("QUEUE (pendientes): ");
        q.print();
        System.out.print("STACK (procesando): ");
        st.print();
        System.out.println("BITÁCORA (confirmados): " + sll.toString());
    }
}
