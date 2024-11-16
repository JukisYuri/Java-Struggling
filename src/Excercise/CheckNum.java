package Excercise;

public class CheckNum {
    public static String CheckNum(int num){
        if(num % 2 == 0) {
            return "So chan";
        } else{
            return "So le";
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % 2 == 0) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
    public static void main(String[] arg){
        System.out.println(CheckNum(2));
        System.out.println(CheckNum(3));
        System.out.println("La 1 so nguyen to?" + " " + isPrime(3));
        System.out.println("La 1 so nguyen to?" + " " + isPrime(8));
    }
}
