package JavaBasic.SimpleExcercise;


public class Baitap157 {
    public static boolean checkNumber(int[] n, int x){
        int result = n.length;
        for (int i = 0; i < result; i++) {
            if(x == n[i]){
                return false;
            }
        }
        return true;
    }
    public static int countNumber(int[] n, int x){
        int result = n.length;
        int maxCount = 0;
        for (int i = 0; i < result; i++) {
            if(x == n[i]){
                maxCount++;
                System.out.println("Xuất hiện ở mảng: " + i);
                }
            }
        return maxCount;
    }
    public static int[] arrayCheck(int[] n, int x) {
        int result = n.length;
        int count = 0;
        for (int i = 0; i < result; i++) {
            if (x == n[i]) {
                count++;
            }
        }
        int[] new_n = new int[n.length - count];
        int index = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] != x) {
                new_n[index++] = n[i];
                System.out.print(n[i] + " ");
            }
        }
        return new_n;
    }
    public static void main(String[] args){
        int[] arr1 = new int[]{2,4,6,8,6};
        int x = 6;
        System.out.println(checkNumber(arr1,x));
        System.out.println(countNumber(arr1, x));
        System.out.println(arrayCheck(arr1,x));
    }
}
