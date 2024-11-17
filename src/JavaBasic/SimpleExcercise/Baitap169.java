package JavaBasic.SimpleExcercise;

public class Baitap169 {
    public static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static int[][] printPascalTriangle(int n){
        int[][] result = new int[n+2][];
        for (int i = 0; i < n+2; i++) {
            result[i] = new int[i];
            for (int j = 0; j < i; j++) {
                if(i == 1 || j == 0){
                    result[i][j] = 1;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[][] A = printPascalTriangle(4);
        printMatrix(A);
    }
}
