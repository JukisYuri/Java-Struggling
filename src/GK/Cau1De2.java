package GK;

import java.util.Scanner;

public class Cau1De2 {
    public static void countNum(int n) {
        int count = 0;
        while (n <= 0){
            System.out.println("Không tồn tại");
            break;
        }
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.print("Kết quả trả ra đếm số chữ số = " + count++);
    }
    public static void reverseNum(int n){
        int reverseN = 0;
        while(n != 0){
            int chuSo = n % 10;
            reverseN = reverseN * 10 + chuSo;
            n /= 10;
        }
        System.out.println("\n" + "Kết quả trả ra của số đảo ngược = " + reverseN);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); System.out.print("Nhap so bat ki: ");
        int n = scanner.nextInt();
        countNum(n);
        reverseNum(n);
    }
}
