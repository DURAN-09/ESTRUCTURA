package U2.Sort.Insertion;

/* Declara un arreglo de temperaturas (enteros o decimales).
2.- Imprime el arreglo original.
3.- Implementa el algoritmo Insertion Sort para ordenar el arreglo de menor a mayor.
4.- Una vez ordenado el arreglo, calcula y muestra:
    -La temperatura mínima
    -La temperatura máxima
    -El rango (máxima – mínima)
    -Las 3 temperaturas más altas (si existen)
    -Las 3 temperaturas más bajas (si existen)

5.- Imprime:
    -Arreglo original
    -Arreglo ordenado
    -Resultados solicitados (mínimo, máximo, rango, top 3 altos,  3 bajos)
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {32, 40, 28, 30};
        int[] original = arr.clone();

        InsertionSort.sort(arr);

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int rango = max - min;

        System.out.println("Arreglo original:");
        for (int n : original) {
            System.out.print(n + " ");
        }

        System.out.println("\nArreglo ordenado:");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        System.out.println("\nTemperatura mínima: " + min);
        System.out.println("Temperatura máxima: " + max);
        System.out.println("Rango: " + rango);

        System.out.print("3 temperaturas más bajas: ");
        for (int i = 0; i < arr.length && i < 3; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n3 temperaturas más altas: ");
        for (int i = arr.length - 1; i >= 0 && i >= arr.length - 3; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
