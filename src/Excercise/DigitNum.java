package Excercise;

import java.util.Scanner;

public class DigitNum {
    public static int countDigit(int num){
        return String.valueOf(Math.abs(num)).length();
    }
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so bat ki: ");
        int x = scanner.nextInt();
        System.out.println("Ket qua tra ra la: " + countDigit(x));
    }
}
