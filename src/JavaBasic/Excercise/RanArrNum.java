package JavaBasic.Excercise;

public class RanArrNum { // Bai 17
    public static void biggestArr(int[] arr){
        int maxIndex = 0;
        int maxValue = arr[0];
        int maxSum = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
                maxIndex = i;
                maxSum = arr[i] + arr[i];
            }
        }
        System.out.println("Gia tri lon nhat cua ham so: " + maxValue);
        System.out.println("Vi tri dau tien cua phan tu lon nhat: " + maxIndex);
        System.out.println("Tong cac gia tri lon nhat: " + maxSum);
    }
    public static void smallestArr(int[] arr){
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat cua ham so: " + minValue);
    }
    public static void main(String[] arg){
        int[] arr = {2,7,8,4,5,8};
        biggestArr(arr);
        smallestArr(arr);

    }
}
