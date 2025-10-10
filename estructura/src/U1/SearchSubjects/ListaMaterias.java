package U1.SearchSubjects;

import java.util.ArrayDeque;
import java.util.Deque;

/*
- Clase ListaMaterias con métodos: void agregar(String materia), boolean contiene(String materia), void imprimir().

1) Insertar al menos 5 materias.
2) Solicitar/definir una materia a buscar.
3) Usar contiene() y mostrar el resultado.
*/
public class ListaMaterias {
    Deque<String> materias;
    public ListaMaterias(){
        materias = new ArrayDeque<>();
    }
    public void agregar(String materia){
        materias.push(materia);
    }
    public boolean contiene(String materia) {
        return materias.contains(materia);
    }
    public void imprimir() {
        System.out.println("Materias: " + materias);
    }
}
