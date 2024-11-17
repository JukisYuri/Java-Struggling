package JavaBasic.GK;

import java.util.Scanner;

public class Cau2De2 {
    public static int[] deteleNum(int[] n, int x){
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if(n[i] != x){
                n[count++] = n[i];
            }
        }
        int[] result = new int[count];
        System.arraycopy(n,0,result,0,count);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); System.out.print("Nhập một số bất kì muốn loại trừ: ");
        int x = scanner.nextInt();
        int[] n = new int[] {1,3,5,7,2,8};
        int[] result = deteleNum(n, x);
        System.out.print("Kết quả trả ra là: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        }
    }

