package U1.BankDocuments;
/*
Instrucciones:
Un banco atiende clientes en una cola.
Cada cliente lleva una pila de documentos.
Encola a 3 clientes con su nombre.
A cada cliente apila 2 documentos.
Atiende al primer cliente, mostrando su nombre y retirando sus documentos uno a uno.
Pasa al siguiente cliente.

Ejemplo de salida:
Cliente en atención: Carlos
Documentos retirados: Doc1, Doc2
Cola restante: [María, José]

Notas:
Crea una clase llamada cliente: id,nombre, documentos (debe de ser un stack)

Métodos:
-agregarDocumento(String doc)
-atender()
   debe de vaciar la pila de docs
   Algo como:
   while(!docs.isEmpty()){
         sout("retirando doc: "+docs.pop())
      }

En main:
Crea la Queue de clientes y haz el proceso de antencion
*/

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main (String[] args){
        Cliente cliente1 = new Cliente(1,"Charly");
        Cliente cliente2 = new Cliente(2,"Chema");
        Cliente cliente3 = new Cliente(3,"Dan");
        Queue<Cliente> clients = new ArrayDeque<>();
        cliente1.addDocument("Document 1");
        cliente1.addDocument("Document 2");
        cliente2.addDocument("Document 2");
        cliente3.addDocument("Document 3");
        clients.offer(cliente1);
        clients.offer(cliente2);
        clients.offer(cliente3);
        int size = clients.size();
        for(int i=0;i<size;i++){
            Queue<String> nombres = new ArrayDeque<>();
            for(Cliente nameClients : clients ){
                nombres.offer(nameClients.getName());
            }
            System.out.println("Cola restante "+nombres);
            Cliente cliente = clients.poll();
            cliente.attend();
        }
    }
}

