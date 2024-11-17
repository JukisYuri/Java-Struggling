package JavaBasic.Excercise;

public class MatrixNum {
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }

        }
    }
    public static int[][] createPascalTriangle(int size){
        // Work together with printMatrix: printMatrix(createPascalTriangle());
        int[][] result = new int[size][];
        for (int i = 0; i < size; i++) {
            result[i] = new int[i];
            for (int j = 0; j < i; j++) {
                if(i <= 1 || j == 0) {
                    result[i][j] = 1;
                    /*  Triangle will be like:
                        1 (if 1)        0 (if 0)
                        1 x             0 x
                        1 x x           0 x x
                        1 x x x         0 x x x
                     */
                } else{
                    result[i][j] = j+1;
                    /* Triangle will be like:
                        1 (if j+1)      1 (if j)
                        1 2             1 1
                        1 2 3           1 1 2
                        1 2 3 4         1 1 2 3
                     */
                }
                
            }


        }
        return result;
    }
    public static int[][] createPascalTriangle2(int[] diagonalValues){
        int n = diagonalValues.length;
        int[][] triangle = new int[n][n];
        for (int i = 0; i < n; i++) {
            triangle[i][i] = diagonalValues[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                triangle[i][j] = triangle[i][j - 1] - 1;

        }
            
        }
        return triangle;
    }

    public static void main(String[] arg){
        int[][] simpleMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(simpleMatrix);
        printMatrix(createPascalTriangle(6));
        int[] diagonalValues = {1,5,-2,0};
        int[][] pascalTriangle2 = createPascalTriangle2(diagonalValues);
        printMatrix(pascalTriangle2);
    }
}
