package JavaBasic.SimpleExcercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Baitap156 {
    public static void selectionSortNumber(int[] arr) { // Selection Sort
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = 0; j < n; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
            for(int i : arr)
                System.out.print(i + " ");
        }
    public static void bubbleSortNumber(int[] arr){ // Bubble Sort
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr)
            System.out.print(i + " ");
    }
    public static void main(String[] args){
        int[] arr1 = new int[]{1,9,4,7,3};
        //selectionSortNumber(arr1);
        bubbleSortNumber(arr1);
    }
}
