package JavaBasic.Excercise;

import java.util.Scanner;

public class DMYNum {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Day: ");
        int d = scanner.nextInt();
        System.out.print("Month: ");
        int m = scanner.nextInt();
        System.out.print("Year: ");
        int y = scanner.nextInt();
        calendarToString(d, m, y);
    }
    public static void calendarToString(int d, int m, int y){
        switch(m){
            case 1: System.out.println(d+"/"+"January"+"/"+y); break;
            case 2: System.out.println(d+"/"+"February"+"/"+y); break;
            case 3: System.out.println(d+"/"+"March"+"/"+y); break;
            case 4: System.out.println(d+"/"+"April"+"/"+y); break;
            case 5: System.out.println(d+"/"+"May"+"/"+y); break;
            case 6: System.out.println(d+"/"+"June"+"/"+y); break;
            case 7: System.out.println(d+"/"+"July"+"/"+y); break;
            case 8: System.out.println(d+"/"+"August"+"/"+y); break;
            case 9: System.out.println(d+"/"+"September"+"/"+y); break;
            case 10: System.out.println(d+"/"+"October"+"/"+y); break;
            case 11: System.out.println(d+"/"+"November"+"/"+y); break;
            case 12: System.out.println(d+"/"+"December"+"/"+y); break;
            default: System.out.println("Not a month!"); break;
        }
    }

}
