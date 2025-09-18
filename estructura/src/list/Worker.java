package list;

public class Worker {
    private int id;
    private String nombre;
    private float sueldo;

    public Worker(int id, String nombre, float sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public float getSueldo() {
        return sueldo;
    }
    @Override
    public String toString(){
        return "worker {id:"+id+"nombre:"+nombre+"sueldo:"+sueldo+" }";
    }
}
