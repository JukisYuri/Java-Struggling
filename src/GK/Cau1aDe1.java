package GK;

import java.util.Scanner;

public class Cau1aDe1 {
    public static boolean checkSoNguyenTo(int randomNum){
        for (int i = 2; i < randomNum - 1; i++) {
            if(randomNum % i == 0) {
                return false;
            } else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 so bat ki: ");
        int randomNum = scanner.nextInt();
        System.out.println("Ket qua tra ra la: " + checkSoNguyenTo(randomNum));
    }


}
