package U1.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        List<Worker> workersToDelete = new ArrayList<>();
        workers.add(new Worker(1,"Carlos",1500));
        workers.add(new Worker(2,"Daniel",900));
        workers.add(new Worker(3,"Cano",100));
        workers.add(new Worker(4,"Chema",600));
        workers.add(new Worker(5,"Juanito",2500));
        workers.add(new Worker(6,"Pepe",2000));
        System.out.println("TRABAJADORES"+workers);
        float total = 0;
        for(Worker w :workers){
            total+=w.getSueldo();
        }
        float promedio = total/workers.size();
        System.out.println("Promedio sueldo"+promedio);
        for(Worker w :workers){
            //workers.removeIf(worker -> w.getSueldo()<1000);
           if(w.getSueldo() < 1000){
               workersToDelete.add(w);
            }
        }
        workers.removeAll(workersToDelete);
        for(Worker w : workers){
            System.out.println("empleado con sueldo >= 1000 : "+w.toString());
        }

    }
}