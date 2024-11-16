package DataStructure.Lab5;

import java.util.Arrays;

public class Task1 {
    // add 2 matrices
    public static int[][] add(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        if(a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException();
        } else {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        }
        return result;
    }
    // subtract 2 matrices
    public static int[][]subtract(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        if(a.length != b.length || a[0].length != b[0].length){
            throw new IllegalArgumentException();
        } else {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        }
        return result;
    }
    // multiply 2 matrices
    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        if(a[0].length != b.length){
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    int cij = 0;
                    for (int k = 0; k < a[0].length; k++) {
                        cij = a[i][k] * b[k][j];
                    }
                    result[i][j] = cij;
                    }
                }
            }
        return result;
    }
    // tranpose a matrix
    public static int[][] transpose(int[][] a) {
        int[][] result = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[j][i] = a[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[][] arr1 = new int[][]{{7,2},{5,3}};
        int[][] arr2 = new int[][]{{2,1},{3,1}};
        int[][] arr3 = new int[][]{{3,4,5}, {2,8}};
        System.out.println("Sum Matrix: " + Arrays.deepToString(add(arr1, arr2)));
        System.out.println("Subtract Matrix: " + Arrays.deepToString(subtract(arr1, arr2)));
        System.out.println("Multiply Matrix: " + Arrays.deepToString(multiply(arr1, arr2)));
        System.out.println("Tranpose Matrix: " + Arrays.deepToString(transpose(arr3)));
    }
}
