package JavaBasic.Excercise;

import java.util.Random;

public class RandomNum {
    public static int[] subArray(int[] arr, int qty){ //code lại
        Random ran = new Random();
        int[] result = new int[qty];
        for (int i = 0; i < qty; i++) {
            int randomIndex = ran.nextInt(arr.length);
            result[i] = arr[randomIndex];
        }
        return result;
    }
    public static void main(String[] arg){
        int[] arr = {1,6,7,3,9,8};
        int qty = 3;
        System.out.println(subArray(arr, qty));
    }
}
