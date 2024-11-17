package SimpleExcercise;

public class Baitap164 {
    public static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static boolean checkDiagonalLine(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != arr[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkBetweenLine(int[][] arr){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != arr[n-i-1][n-j-1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[][] arr1 = new int[][]{{1,2,3},
                                  {2,3,4},
                                  {3,4,5}};
        int[][] arr2 = new int[][]{{1,2,3},
                                   {2,3,2},
                                   {3,2,1}};
        System.out.println(checkDiagonalLine(arr1));
        System.out.println(checkBetweenLine(arr2));
    }
}
