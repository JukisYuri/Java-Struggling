package Assigment3;

import java.util.Scanner;

public class CharCheck {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 ki tu so hoac chu bat ki: ");
        String input = scanner.next();
        char N = input.charAt(0);

        if(Character.isUpperCase(N)){
            System.out.println("CHUHOA");
        } else if(Character.isLowerCase(N)){
            System.out.println("CHUTHUONG");
        } else if(Character.isDigit(N)){
            int number = Character.getNumericValue(N);
            if(number % 2 == 0){
                System.out.println("So chan");
            } else {
                System.out.println("So le");
            }
        }
    }
}
