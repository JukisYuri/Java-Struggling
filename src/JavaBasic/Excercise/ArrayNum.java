package JavaBasic.Excercise;

public class ArrayNum {
    public static int[] arrayPlus(int[] arr1, int[] arr2){
        int[] result = arr1.length > arr2.length ? arr1:arr2;
        int minLength = Math.min(arr1.length, arr2.length);

        for (int i = 0; i < minLength; i++) {
            if(arr1.length > arr2.length){
                result[i] += arr2[i];
            } else{
                result[i] += arr1[i];
            }
        }
        return result;
    }
    public static void display(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            
        }
    }
    public static void main(String[] arg){
            int[] arr1 = new int[] {1,3,7,5};
            int[] arr2 = new int[] {2,3,1,4,6};
            display(arrayPlus(arr2, arr1));

    }
}
