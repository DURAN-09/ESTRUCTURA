package U2.Sort.Selection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de números: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int paresCount = 0;
        int imparesCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                paresCount++;
            } else {
                imparesCount++;
            }
        }

        int[] pares = new int[paresCount];
        int[] impares = new int[imparesCount];

        int p = 0;
        int im = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                pares[p] = arr[i];
                p++;
            } else {
                impares[im] = arr[i];
                im++;
            }
        }

        SelectionSort.sort(pares);
        SelectionSort.sort(impares);

        System.out.print("Arreglo original: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nPares ordenados: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.print("\nImpares ordenados: ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}
