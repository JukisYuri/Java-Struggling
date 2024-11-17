package JavaBasic.GK;

public class Cau3De2 {
    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            System.out.println();
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
    // Phương thức tính tổng mỗi dòng
    public static int[][] calculateRowSums(int[][] matrix) {
        int[] rowSums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            rowSums[i] = rowSum;
        }
        return new int[][]{rowSums};
    }

    // Phương thức tìm chỉ số của dòng có tổng lớn nhất
    public static int findMaxRowIndex(int[] rowSums) {
        int maxRowIndex = 0;
        int maxRowSum = rowSums[0];
        for (int i = 1; i < rowSums.length; i++) {
            if (rowSums[i] > maxRowSum) {
                maxRowIndex = i;
                maxRowSum = rowSums[i];
            }
        }
        return maxRowIndex;
    }
    public static void main(String[] args){
        int[][] arr1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        printMatrix(arr1);
        printMatrix(calculateRowSums(arr1));
        int[][] rowSums = calculateRowSums(arr1);
        int maxRowIndex = findMaxRowIndex(rowSums[0]);
        System.out.println("\nMax row index: " + maxRowIndex);
    }
}
