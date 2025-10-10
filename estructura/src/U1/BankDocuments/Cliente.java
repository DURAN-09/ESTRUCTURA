package U1.BankDocuments;

import java.util.ArrayDeque;
import java.util.Deque;

public class Cliente {
    private int id;
    private String name;
    Deque<String> docs;
    public Cliente(int id,String name){
        this.id  = id;
        this.name = name;
        docs = new ArrayDeque<>();
    }
    public void addDocument(String doc){
        docs.push(doc);
    }
    public void attend(){
        while (!docs.isEmpty()) {
            System.out.println("Documento retirado " + docs.pop());
        }
    }
    public String getName(){
        return this.name;
    }
}
