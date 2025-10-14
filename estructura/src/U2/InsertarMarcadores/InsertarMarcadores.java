package U2.InsertarMarcadores;
/*
Dado el siguiente arregloEntrada:
{
  {1},
  {6,3,1},
  {1,2,3,4},
  {0,5,3,0},
  {2,5,9},
  {2,4,8,9,10}
}
Logra la siguiente salida
Salida:


Entregables:
Url del repo
capturas de pantalla
Notas:
No se permite el uso de strems o clases externas, tampoco se permite el acceso directo
de los elementos, tiene que ser de forma automática usando ciclos
 */
public class InsertarMarcadores {
    public static void main(String[] args){
        int[][] entrada = new int[][]{
                {1},
                {6,3,1},
                {1,2,3,4},
                {0,5,3,0},
                {2,5,9},
                {2,4,8,9,10}
        };
        int[][] salida = new int[entrada.length][];

        for(int i = 0 ; i< entrada.length;i++){
            int[] fila = entrada[i];
            int largo = fila.length;

            int res = 0;
            if(largo %2 != 0){
                res = 0;
            }else{
                int first = 0;
                int second = 0;
                for(int j = 0; j< largo; j++){
                    if(j == 0){
                        first = fila[j];
                    }
                    if(j == largo){
                        second = fila[j];
                    }
                }
                res = first + second;
            }
            int[] nuevo = new int[largo + 1];
            for(int j = 0 ; j < largo; j++){
                nuevo[j] = fila[j];
            }
            nuevo[largo] = res;
            salida[i] = nuevo;
        }
        System.out.println("{");
        for (int i = 0; i < salida.length; i++) {
            System.out.print("  {");
            for (int j = 0; j < salida[i].length; j++) {
                System.out.print(salida[i][j]);
                if (j < salida[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("}");
        }
        System.out.println("}");
    }
}
