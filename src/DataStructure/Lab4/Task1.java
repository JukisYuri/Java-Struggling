package DataStructure.Lab4;

import java.util.Arrays;

public class Task1 {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // sort by descending order
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[minIndex] < array[j]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
        System.out.println("Selection Sort: " + Arrays.toString(array));
    }

    // sort by descending order
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort: " + Arrays.toString(array));
    }
    // sort by descending order
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while(j > 0 && array[j-1] < temp){ // So sánh tăng dần thì array[j-1] > temp
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
        System.out.println("Insertion Sort: " + Arrays.toString(array));
    }

    public static void main(String[] args){
        int[] arr = {1,8,5,6,3,9};
        selectionSort(arr);
        bubbleSort(arr);
        insertionSort(arr);
    }
}
