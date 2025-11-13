package U2.CalificationsSelection;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas calificaciones deseas registrar?");
        int n = sc.nextInt();
        sc.nextLine();

        float[] calificaciones = new float[n];
        String[] nombres = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
            nombres[i] = sc.nextLine();

            System.out.println("Ingrese la calificación de " + nombres[i] + ":");
            calificaciones[i] = sc.nextFloat();
            sc.nextLine();
        }

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (calificaciones[j] > calificaciones[maxIndex]) {
                    maxIndex = j;
                }
            }

            float tempCal = calificaciones[i];
            calificaciones[i] = calificaciones[maxIndex];
            calificaciones[maxIndex] = tempCal;

            String tempNom = nombres[i];
            nombres[i] = nombres[maxIndex];
            nombres[maxIndex] = tempNom;
        }

        System.out.println("\n Resultados ordenados");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + ": " + calificaciones[i]);
        }
    }
}
