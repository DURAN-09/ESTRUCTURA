package U1.SearchSubjects;

public class Main {
    public static void main(String[] args){
        String buscar = "materia4";
        ListaMaterias lista = new ListaMaterias();
        lista.agregar("materia1");
        lista.agregar("materia2");
        lista.agregar("materia3");
        lista.agregar("materia4");
        lista.agregar("materia5");

        lista.imprimir();
        System.out.println("Buscando:"+buscar);
        if(lista.contiene(buscar)){
            System.out.println("Resultado: Materia encontrada");
        } else {
            System.out.println("Resultado: Materia no encontrada");
        }
    }
}
