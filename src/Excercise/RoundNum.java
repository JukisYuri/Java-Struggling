package Excercise;

public class RoundNum {
    public static int RoundNum(double Num){
        if (Num % 1 >= 0.5) {
            return (int) Num + 1;
        } else {
            return (int) Num;
        }
    }
    public static void main(String[] arg){
        System.out.println(RoundNum(2.3));
        System.out.println(RoundNum(2.5));
    }
}

