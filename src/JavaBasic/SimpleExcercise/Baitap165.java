package JavaBasic.SimpleExcercise;

public class Baitap165 {
    public static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static int[][] printReverseMatrix(int[][] arr){
        int n = arr.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }
    public static int[][] transposeColum(int[][] mtr) { // Cách 1 by KleiTus
        int sizeR= mtr.length;
        int sizeC= mtr[0].length;
        int[][]result = new int[sizeR][sizeC];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j]= mtr[i][sizeC-j-1];
            }
        }
        return result;
    }
    // ----------------------------------------------------------------------------------------
    public static int[][] reverseMinusMatrixOther(int[][] arr, int n){ // Cách 2 by JukisYuri
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = arr[i][n-j-1];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int arr[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int arr2[][] = new int[][]{
                {1, 2, 3},
                {4, 3, 6},
                {7, 8, 9}
        };
        int[][] A = printReverseMatrix(arr);
        int[][] B = transposeColum(arr);
        int[][] C = reverseMinusMatrixOther(arr, 3);
        printMatrix(A);
        printMatrix(B);
        printMatrix(C);
    }
}
