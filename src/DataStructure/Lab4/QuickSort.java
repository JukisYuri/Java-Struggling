package DataStructure.Lab4;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    // sort by ascending order
    public static void quickSort(int[] array) {
        int n = array.length;
        if (n <= 1) {
            return;
        } else {
            int pivot = getPivotLast(array); // Select pivot
            int[] left = new int[n];
            int[] right = new int[n];
            int leftSize = 0;
            int rightSize = 0;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] < pivot) {
                    left[leftSize++] = array[i];
                } else if (array[i] > pivot) {
                    right[rightSize++] = array[i];
                }
            }
            left = Arrays.copyOf(left, leftSize);
            right = Arrays.copyOf(right, rightSize);
            quickSort(left);
            quickSort(right);
            concatenate(left, pivot, right, array);
        }
    }
    // concatenate left - pivot - right
    public static void concatenate(int[] left, int pivot, int[] right, int[] array) {
        int index = 0;
        for (int leftIndex = 0; leftIndex < left.length; leftIndex++) {
            array[index++] = left[leftIndex];
        }
        array[index++] = pivot;
        for (int rightIndex = 0; rightIndex < right.length; rightIndex++) {
            array[index++] = right[rightIndex];
        }
    }
    // select pivot element based on the last element in the array
    private static int getPivotLast(int[] array) {
        return array[array.length - 1];
    }
    //select pivot element based on the median of three strategy
    private static int getPivotMedianOfThree(int[] array) {
        int first = array[0];
        int middle = array[array.length/2];
        int last = array[array.length-1];
        return Math.max(Math.min(first, middle), Math.min(Math.max(first, middle), last));
    }
    // select pivot element based on the first element in the array
    private static int getPivotFirst(int[] array) {
        return array[0];
    }
    // select pivot element based on choosing a randomly element in the array
    private static int getPivotRandom(int[] array) {
        Random random = new Random();
        return random.nextInt(array.length);
    }
    public static void main(String[] args){
    int[] arr = {9,0,2,4,1,3,6,5,7,8};
    quickSort(arr);
    System.out.println(Arrays.toString(arr));
    }
}
