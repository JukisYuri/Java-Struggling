package JavaBasic.Excercise;

import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    public static void findPrimesGreaterThanA(int a, int b) {
        int primesFound = 0;
        int currentNumber = a + 1;
        while (primesFound < b) {
            if (isPrime(currentNumber)) {
                System.out.print(currentNumber + " ");
                primesFound++;
            }
            currentNumber++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên lớn hơn %d là:\n", b, a);
        findPrimesGreaterThanA(a, b);
    }


}
