package JavaBasic.SimpleExcercise;

public class Baitap155 {
    public static void moveMatrix(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        moveMatrix(arr);
    }
}
