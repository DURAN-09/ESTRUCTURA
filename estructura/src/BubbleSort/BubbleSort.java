package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] arr){
        int n = arr.length;
        //recorremos los elementos del arreglo
        for(int i = 0; i< n - 1; i++){
            //Recorremos los elementos adyacentes -1 -i
            for(int j = 0; j< n - i - 1; j++){
                //el elemento actual es mayor que el siguiente?
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(arr));

    }
}
