package JavaBasic.Excercise;

public class IntArrNum {

    public static boolean intArr(int[] intArr1, int[] intArr2){ // Can suy nghi them, co the code dung hoac khong?
        int max = intArr1.length - intArr2.length + 1;
        outer:
        for (int i = 0; i < max; i++) {
            inner:
            for (int j = 0; j < intArr2.length; j++) {
                if (intArr2[j] != intArr1[i+j]) {
                    continue outer;
                }
            }
        }
        return false;
    }
    public static void main(String[] arg){
       int[] intArr1 = new int[] {2,7,8,9,3,4};
       int[] intArr2 = new int[] {2,7,8};
       System.out.println(intArr(intArr1, intArr2));
    }

}
