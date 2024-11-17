package JavaBasic.GK;

public class Cau2De1 {
    public static boolean daySoDanDau(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(Integer.signum(arr[i]) == Integer.signum(arr[i]-1)) { // Check if i = -i then return false
                return false;
            } else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] arg){
        int[] arr1 = new int[]{1,-4, 3,-2, 6,-7};
        int[] arr2 = new int[]{2, 3, -7, 3, -9, 10, 11};
        System.out.println(daySoDanDau(arr1)); // return true
        System.out.println(daySoDanDau(arr2)); // return false
    }
}
