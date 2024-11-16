package DataStructure.Lab2_Task1;

public class Task1_3 {
        // This method is used to display a Pascal triangle based on the parameter n.
        // Where n represents the number of rows
        public static void printPascalTriangle(int row) {
            for (int i = 1; i <= row; i++) {
                int[] pascalTriangleRow = getPascalTriangle(i);
                for (int k = row-i + 1; k > 0; k--) {
                    System.out.print("\t");
                }
                for (int k : pascalTriangleRow) {
                    System.out.print(k + "\t\t");
                }
                System.out.println();
            }
        }
        // get the n^th row.
        // For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
        public static int[] getPascalTriangle(int n) {
            if(n==1){
                return new int[]{1};
            } else {
                int[] prevRow = getPascalTriangle(n-1);
                return generateNextRow(prevRow);
            }
        }
        // generate the next row based on the previous row
        //Ex. prevRow = {1} ==> nextRow = {1, 1}
        //Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
        public static int[] generateNextRow(int[] prevRow) {
            int[] nextRow = new int[prevRow.length+1];
            nextRow[0] = 1;
            nextRow[nextRow.length-1] = 1;
            for (int i = 1; i < nextRow.length - 1; i++) {
                nextRow[i] = prevRow[i-1] + prevRow[i];
            }
            return nextRow;
        }
        public static void main(String[] args){
            printPascalTriangle(10);
        }
    }
