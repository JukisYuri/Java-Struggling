package DataStructure.Lab1_Array1D;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArray {
    private int[] array;
    public MyArray(int[] array){
        this.array = array;
    }
    //Method mirror that outputs the contents of an array in a
    //reverse order like a mirror
    //Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]
    public int[] mirror() {
        int n = array.length;
        int[] result = new int[n*2];
        for (int i = 0; i < n; i++) {
            result[i] = array[i];
            for(int j = n-1; j >= 0; j--){
                result[n + j] = array[n - 1 - j];
                }
            }
        return result;
    }
    // removes all duplicate elements from an array and returns a
    // new array
    //Input: 1 3 5 1 3 7 9 8
    //Output: 1 3 5 7 9 8
    public int[] removeDuplicates() {
        int n = array.length;
        int index = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                    }
                }
                if(!isDuplicate){
                    result[index++] = array[i];
                }
            }
        int[] finalResult = new int[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }
    // Check whether a given array is sorted.
    // Input: 10 11 12 13 14 16 17 19 20
    // Output: true
    public boolean isSorted() {
        int n = array.length;
        for (int i = 1; i < n-1; i++) {
                if ((array[i - 1] < array[i] && array[i] > array[i + 1]) || (array[i - 1] > array[i] && array[i] < array[i + 1])) {
                    return false;
                }
            }
        return true;
        }
    // determine missing values from a sorted array.
    // Input: 10 11 12 13 14 16 17 19 20
    // Output: 15 18
    public int[] getMissingValues() {
        int n = array.length;
        int[] result = new int[n];
        for (int i = 0; i < n-1; i++) {
                if (array[i + 1] - array[i] != 1) {
                    result[i] = (array[i] + array[i + 1]) / 2;
                }
            }
        return result;
    }
    // Fill missing data by the minimal average of its k
    // neighbors
    // Input: 10 11 12 -1 14 16 17 19 20
    // Output(k=3): 10 11 12 12 14 16 17 19 20
    public int[] fillMissingValues(int k) {
        int n = array.length;
        ArrayList<Integer> countLeft = new ArrayList<>();
        ArrayList<Integer> countRight = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (array[i] == -1) {
                for (int j = i - 1; j >= 0 && countLeft.size() < k / 2; j--) {
                    countLeft.add(array[j]);
                }
                for (int j = i + 1; j < n && countRight.size() + countLeft.size() < k; j++) {
                    countRight.add(array[j]);
                }
                break;
            }
        }
        ArrayList<Integer> neighbors = new ArrayList<>(countLeft);
        neighbors.addAll(countRight);

        if (neighbors.size() < k) {
            k = neighbors.size();
        }
        int minimalValue = Integer.MAX_VALUE;
        for (int neighbor : neighbors) {
            if (neighbor < minimalValue) {
                minimalValue = neighbor;
            }
        }
        int[] filledArray = array.clone();
        for (int i = 0; i < n; i++) {
            if (filledArray[i] == -1) {
                filledArray[i] = minimalValue;
            }
        }
        return filledArray;
    }


    public static void main(String[] args) {
        MyArray M1 = new MyArray(new int[]{10, 11, 12, 13, 14, 16, 17, 19, 20});
        MyArray M2 = new MyArray(new int[]{1, 2, 3});
        MyArray M3 = new MyArray(new int[]{10, 11, 12, 13, 14, 16, 17, 19, 20});
        MyArray M4 = new MyArray(new int[]{10, 11, 12, -1, 14, 16, 17, 19, 20}); // final method check
        MyArray M5 = new MyArray(new int[]{1, 3, 5, 1, 3, 7, 9, 8});
        System.out.println(M1.isSorted());
        System.out.println(Arrays.toString(M2.mirror()));
        System.out.println(Arrays.toString(M3.getMissingValues()));
        System.out.println(Arrays.toString(M5.removeDuplicates()));
        System.out.println(Arrays.toString(M4.fillMissingValues(3)));
    }
}
