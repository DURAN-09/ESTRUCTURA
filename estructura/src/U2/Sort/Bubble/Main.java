package U2.Sort.Bubble;

import java.util.Scanner;

/*
 Solicita al usuario un arreglo de números enteros.
2.- Imprime el arreglo original.
3.- Implementa Bubble Sort para ordenar el arreglo de menor a mayor.
4.- Una vez ordenado el arreglo, identifica:
    -El primer elemento (mínimo)
    -El último elemento (máximo)
    -La diferencia entre ambos valores

5- Imprime:
    -Arreglo original
    -Arreglo ordenado
    -Valor mínimo
    -Valor máximo
    -Diferencia (máximo – mínimo)

Notas:
No se permite usar colecciones (ArrayList, etc.), solo arreglos.
No se aceptan código generados o autocompletados
No se permite usar Arrays.sort()

Entregables:
Url del repo
Capturas de pantalla
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la dimensión del arreglo :");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa el valor " + (i + 1) + " del arreglo :");
            array[i] = sc.nextInt();
        }
        System.out.println("Arreglo original :"+ java.util.Arrays.toString(array));
        int[] sorted = BubbleSort.sort(array);
        int min = sorted[0];
        int max = sorted[sorted.length - 1];
        int dif= max - min;
        System.out.println("Arreglo ordenado :"+ java.util.Arrays.toString(sorted));
        System.out.println("Mayor : "+max+" , Menor : "+min+" , Diferencia : "+dif);

    }
}
