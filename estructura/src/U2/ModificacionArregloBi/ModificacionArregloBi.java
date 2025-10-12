package U2.ModificacionArregloBi;

public class ModificacionArregloBi {
    public static void main(String[] args) {

        int[][] arrTest = {
                {1},
                {6, 3, 1},
                {1, 2, 3, 4},
                {0, 5, 3, 0},
                {2, 5, 9},
                {2, 4, 8, 9, 10}
        };

        for (int i = 0; i < arrTest.length; i++) {
            int[] fila = arrTest[i];
            int nuevaLongitud = fila.length + 1;
            int[] nuevaFila = new int[nuevaLongitud];

            for (int j = 0; j < fila.length; j++) {
                nuevaFila[j] = fila[j];
            }

            nuevaFila[fila.length] = fila.length + 1;
            arrTest[i] = nuevaFila;
        }

        for (int i = 0; i < arrTest.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arrTest[i].length; j++) {
                System.out.print(arrTest[i][j]);
                if (j < arrTest[i].length - 1) System.out.print(", ");
            }
            System.out.println("}");
        }
    }
}
