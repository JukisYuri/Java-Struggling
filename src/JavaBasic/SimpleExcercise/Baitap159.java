package JavaBasic.SimpleExcercise;

public class Baitap159 {
    public static boolean checkSymmetry(int[] arr) {
        int n = arr.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkSign(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++){
            if ((arr[i] >= 0 && arr[i-1] >= 0) || (arr[i] <= 0 && arr[i-1] <= 0)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr1 = new int[]{4,2,7,3,7,2,4};
        int[] arr2 = new int[]{2,-1,7,-3,4,-5,6};
        System.out.print(arr1.length + "\n");
        System.out.println(checkSymmetry(arr1));
        System.out.println(checkSign(arr2));
    }
}
