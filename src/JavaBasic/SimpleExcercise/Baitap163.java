package SimpleExcercise;

public class Baitap163 {
    public static void printMatrix(int[][] arr){
        int max = 0;
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
                if(min > arr[i][j]){
                    min = arr[i][j];
                }
                }
            }
        System.out.println("Max: " + max + "\n" + "Min: " + min);
        }
    public static int sumInMatrix(int[][] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result += arr[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int arr[][] = new int[][]{{1,3,4},{2,3,4},{5,7,8}};
        printMatrix(arr);
        System.out.println(sumInMatrix(arr));
    }
}
