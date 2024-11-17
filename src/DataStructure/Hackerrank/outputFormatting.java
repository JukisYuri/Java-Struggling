package YourselfLearning.Hackerrank;

import java.util.Scanner;

public class outputFormatting {
    public static void arraySort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        char[] arr = {'A', 'a', 'C', 's'};
        arraySort(arr);
        System.out.println(String.valueOf(arr));
        }
    }

