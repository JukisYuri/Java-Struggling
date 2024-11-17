package SimpleExcercise;

public class Array2DSuck {
    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
    public static void main(String[] arg) {
        int[][] num1 = {{1, 2, 3}, {2, 3, 5}, {4, 1, 9}};
        printMatrix(num1);

    }
}

