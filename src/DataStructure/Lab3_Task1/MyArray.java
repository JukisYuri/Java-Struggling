package DataStructure.Lab3_Task1;

import java.util.Arrays;
import java.util.Collections;

public class MyArray {
    private int[] array;
    public MyArray(int[] array) {
        this.array = array;
    }
    // To find the index of the target in the array. If the target is not found in the array, then the method returns -1.
    // Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
    // Output: 3
    public int iterativeLinearSearch(int target) {
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    // To find the index of the target in the array. If the target is not found in the array, then the method returns -1.
    // Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
    // Output: -1
    public int recursiveLinearSearch(int target) {
        if(array.length == 0){
            return -1;
        }
        return helpRecursiveLinearSearch(target, 0);
    }
    public int helpRecursiveLinearSearch(int target, int i){
        if(i >= array.length){
            return -1;
        } else if (array[i] == target) {
            return i;
        } else {
            return helpRecursiveLinearSearch(target, i+1);
        }
    }
    // To find the index of the target in the sorted array. If the target is not found in the array, then the method returns -1.
    public int iterativeBinarySearch(int target) {
        int left = 0;
        int right = array.length-1;
        if(array.length == 0){
            return -1;
        }
        while(left <= right){
            int mid = left + (right-left)/2;
            if(target == array[mid]){
                return mid;
            } else if(target > array[mid]){ // Logic cho mảng giảm dần
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    // To find the index of the target in the sorted array. If the target is not found in the array, then the method returns -1.
    public int recursiveBinarySearch(int target) {
        return helpRecursiveBinarySearch(array, target, 0, array.length-1);
    }
    public int helpRecursiveBinarySearch(int[] data, int target, int left, int right){
        if (left > right){
            return -1;
        } else {
            int mid = left + (right-left)/2;
            if(target == array[mid]){
                return mid;
            } else if(target > array[mid]){ // Logic cho mảng giảm dần
                return helpRecursiveBinarySearch(data, target, left, mid-1);
            } else {
                return helpRecursiveBinarySearch(data, target, mid+1, right);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {12,10,9,45,2,10,10,45};
        MyArray myArray = new MyArray(arr);
        System.out.println("Linear Iterative: " + myArray.iterativeLinearSearch(45));
        System.out.println("Linear Recursive: " + myArray.recursiveLinearSearch(15));
        Integer[] arrConvert = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrConvert[i] = arr[i];
        }
        Arrays.sort(arrConvert, Collections.reverseOrder()); // Sắp xếp mảng theo thứ tự giảm dần
        for (int i = 0; i < arrConvert.length; i++) {
            arr[i] = arrConvert[i];
        }
        System.out.println("Reverse Binary Interative: " + myArray.iterativeBinarySearch(9));
        System.out.println("Reverse Binary Recursive: " + myArray.recursiveBinarySearch(12));
    }
}
