package JavaBasic.GK;

public class Cau3De1 {
    public static void printMatrix(int[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
    }
    public static boolean acrossMatrixLine(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                if(matrix[i][j] != matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] arg){
        int[][] arr1 = new int[][] {{2,3,4},{2,5,7},{5,1,8}};
        int[][] arr2 = new int[][] {{2,3,5},
                                    {3,7,9},
                                    {5,9,8}};
        printMatrix(arr1);
        System.out.println("\n" + "Ket qua tra ra la: " + acrossMatrixLine(arr1)); // Result: False
        System.out.println("Ket qua tra ra la: " + acrossMatrixLine(arr2)); // Result: True
    }
}
