package SimpleExcercise;


import java.util.Arrays;

public class Baitap166 {
    public static void sumRowMatrix(int[][] arr){;
        int index = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum " +i+  " Row: " + sum);
            if(maxSum < sum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println("Max Index: " + index);
    }
  public static void main(String[] args){
        int[][] arr = new int[][]{{1,2,3},{2,3,4},{2,5,1}};
        sumRowMatrix(arr);
    }
}
