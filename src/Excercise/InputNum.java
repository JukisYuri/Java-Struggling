package Excercise;

import java.util.Scanner;

public class InputNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        printPrimeNumbers(a, b);
    }

    public static void printPrimeNumbers(int a, int b) {
        int count = 0;
        // Bắt đầu từ số nguyên tố đầu tiên lớn hơn a
        for (int i = a + 1; count < b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}