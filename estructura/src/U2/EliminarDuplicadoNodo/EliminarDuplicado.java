package U2.EliminarDuplicadoNodo;

public class EliminarDuplicado {
    public static Node eliminar(Node head){
        Node current = head;
        while(current != null ){
            Node current2 = current;
            while (current2.next != null){
                if(current2.next.val == current.val){
                    current2.next =  current2.next.next;
                }else {
                    current2 = current2.next;
                }
            }
            current = current.next;
        }
        return head;
    }
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " → ");
            current = current.next;
        }
        System.out.println("null");
    }
}
