package Assigment2;

import java.util.Scanner;

public class MathChecking {
    public static double Summation(double a, double b, double c){
        return a+b+c;
    }
    public static double Avg(double a, double b, double c){
        int result = (int) ((int)a+b+c/3);
        return result;
    }
    public static double Multiple(double a, double b, double c) {
        return a * b * c;
    }
    public static double Smallest(double a, double b, double c){
        return Math.min(a, Math.min(b,c));
    }
    public static double Biggest(double a, double b, double c){
        return Math.max(a, Math.max(b,c));
    }
    public static String checkNumber(double a, double b){
        if(a % b == 0) {
            return "a co the chia het cho b";
        } else{
            return "a khong the chia het cho b";
        }
    }
    public static void main(String[] arg){
        System.out.println("Vay cong lai tra ra la: " + Summation(2.0,3.0,4.0));
        System.out.println("Vay so nhan tra ra la: " + Multiple(3,3,3));
        System.out.println("Vay so trung binh cong tra ve la: " + Avg(2.5,3.3,6.8));
        System.out.println("So lon nhat: " + Biggest(2,9,6.4));
        System.out.println("So be nhat: " + Smallest(2,3.4,24));
        System.out.println("Kiem tra xem 2 con so co chia duoc cho nhau khong: " + checkNumber(4,2));
    }
}
