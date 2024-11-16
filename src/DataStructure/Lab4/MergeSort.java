package DataStructure.Lab4;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] array, int first, int last) {
        if(first == last){
            return new int[]{array[first]};
        } else {
            int middle = ((last+first)/2);
            int[] leftHalfArray = mergeSort(array, first, middle);
            int[] rightHalfArray = mergeSort(array, middle+1, last);
            return merge(leftHalfArray, rightHalfArray);
        }
    }

    public static int[] merge(int[] leftArray, int[] rightArray){
        int[] mergedArray = new int[leftArray.length + rightArray.length];
        int leftIndex = 0; int rightIndex = 0;
        int mergedIndex = 0;
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                mergedArray[mergedIndex++] = rightArray[rightIndex++];
            } else {
                mergedArray[mergedIndex++] = leftArray[leftIndex++];
            }
        }
        while (leftIndex < leftArray.length) {
            mergedArray[mergedIndex++] = leftArray[leftIndex++];
        }
        while (rightIndex < rightArray.length) {
            mergedArray[mergedIndex++] = rightArray[rightIndex++];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 8, 3, 9, 5, 7, 0};
        int[] sortedArr = mergeSort(arr, 0 ,arr.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(sortedArr));
    }
}



