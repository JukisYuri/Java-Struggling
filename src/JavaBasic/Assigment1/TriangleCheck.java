package JavaBasic.Assigment1;
import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a:");
        int a = scanner.nextInt();
        System.out.print("Nhap canh b:");
        int b = scanner.nextInt();
        System.out.print("Nhap canh c:");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Tam giac deu");
            } else if (a == b || b == c || c == a) {
                System.out.println("Tam giac can");
            } else if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
                System.out.println("Tam giac vuong");
            } else {
                System.out.println("Tam giac thuong");
            }
        } else {
            System.out.println("Khong tao thanh tam giac");
        }
        scanner.close();
    }
}






