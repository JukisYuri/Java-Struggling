package SimpleExcercise;

public class Baitap154 {
    public static void countNumberArray(int[] arr) {
        int countNumLarger0 = 0;
        int countNumSmaller0 = 0;
        int countNumEquals0 = 0;
        outer:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countNumLarger0++;
                continue outer;
            }
            if (arr[i] < 0) {
                countNumSmaller0++;
                continue outer;
            }
            if (arr[i] == 0) {
                countNumEquals0++;
                continue outer;
            }
        }
        System.out.print("Có " + countNumLarger0 + " số lớn hơn 0" + "\n");
        System.out.print("Có " + countNumSmaller0 + " số bé hơn 0" + "\n");
        System.out.println("Có " + countNumEquals0 + " số bằng 0");
    }
    public static void defineNumberArray(int[] arr){
        int maxMinusNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        outer:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (arr[i] > maxMinusNumber) {
                    maxMinusNumber = arr[i];
                    continue outer;
                }
            }
            if (arr[i] > 0) {
                if (arr[i] < minNumber) {
                    minNumber = arr[i];
                    continue outer;
                }
            }
        }
        System.out.println("Số âm lớn nhất là: " + maxMinusNumber);
        System.out.println("Số dương nhỏ nhất là: " + minNumber);
    }
    public static boolean checkNumberArray(int[] arr) {
        int resultSumMinusNumber = 0;
        int resultSumNumber = 0;
        outer:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                resultSumMinusNumber += arr[i];
                continue outer;
            }
            if (arr[i] >= 0) {
                resultSumNumber += arr[i];
                continue outer;
            }
        }
        return (Math.abs(resultSumMinusNumber) == resultSumNumber);
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,-3,4,5,0,-4,-8};
        int[] arr2 = new int[]{1,2,3,-1,-2,-3};
        countNumberArray(arr);
        defineNumberArray(arr);
        System.out.println("Kết quả trả ra là: " + checkNumberArray(arr));
        System.out.println("Kết quả trả ra là: " + checkNumberArray(arr2));
    }
}
