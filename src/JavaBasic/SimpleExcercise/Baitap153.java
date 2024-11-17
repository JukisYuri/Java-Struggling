package SimpleExcercise;

public class Baitap153 {
    public static void main(String[] arg){
        int[] arr = {2,5,3,6,8};
        findMax(arr);
    }
    public static void findMax(int[] array){
        int count = 0;
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        count++;
        System.out.println("Phần tử lớn nhất xuất hiện trong dãy: " + count + " lần, và số phần tử lớn nhất là: " + maxValue);
    }
}
