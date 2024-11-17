package GK;

import java.util.Scanner;

public class Cau1bDe1 {
    public static void phanTichSoNguyenTo(int randomNum) {
        int i = 2;
        while (randomNum > 1){
            if (randomNum % i == 0) {
                System.out.print(i + " ");
                randomNum = randomNum/i;
            } else {
                i++;
            }
        }
    }
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 so bat ki: ");
        int randomNum = scanner.nextInt();
        phanTichSoNguyenTo(randomNum);
    }


}
