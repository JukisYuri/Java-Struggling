package SimpleExcercise;

public class Baitap167 {
    public static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static int[][] sumMatrix(int[][] arr1, int[][] arr2, int n){
        if(arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
            return null;
        }
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }
    public static int[][] minusMatrix(int[][] arr1, int[][] arr2, int n){
        if(arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
            return null;
        }
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    result[i][j] = arr1[i][j] - arr2[i][j];
                }
        }
        return result;
    }
    public static void main(String[] args){
        int[][] arr1 = new int[][]{{1,2,3},{2,3,4},{6,2,1}};
        int[][] arr2 = new int[][]{{2,4,1},{2,7,3},{4,0,1}};
        int n = 3;
        int[][] A = sumMatrix(arr1, arr2, n);
        int[][] B = minusMatrix(arr1, arr2, n);
        printMatrix(A);
        printMatrix(B);

    }
}
