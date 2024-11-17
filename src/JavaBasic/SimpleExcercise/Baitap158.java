package JavaBasic.SimpleExcercise;

public class Baitap158 {
    public static boolean checkArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[++i] <= arr[++j + 1]) {
                    return true;
                } else {
                    return false;
                }
        return false;
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[i] < arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,5};
        int[] arr2 = new int[]{1,9,4,8};
        System.out.println(checkArray(arr1));
        System.out.print(checkArray(arr2) + "\n");
        bubbleSort(arr2);
    }
}
