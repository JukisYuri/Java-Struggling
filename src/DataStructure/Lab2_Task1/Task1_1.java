package DataStructure.Lab2_Task1;

public class Task1_1 {
    // S(n)=1-2+3-4+...+ ((-1)^(n+1) ).n , n>0
    public static int getSn1(int n) {
        if (n == 1){ return 1;
        } else {
            return (int) (getSn1(n-1) + Math.pow(-1, n+1) * n);
        }
    }
    // S(n)=1+1.2+1.2.3+...+1.2.3...n, n>0
    public static int getSn2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (getSn2(n-1) + factorial(n));
        }
    }
    private static int factorial(int n) { // Hàm bổ sung cho giai thừa
        if(n==1){
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }

    // S(n)=1^2+2^2+3^2+....+n^2 , n>0
    public static int getSn3(int n) {
        if(n==1){
            return 1;
        } else {
            return (int) (getSn3(n-1) + n*n);
        }
    }
    // S(n)=1+1/2+1/(2.4)+1/(2.4.6)+...+1/(2.4.6.2n), n>=0
    public static double getSn4(int n) {
        if(n==1){
            return 1;
        } else {
            return (1/(Math.pow(2,n-1) * factorial(n - 1))) + getSn4(n - 1);
        }
    }
    public static void main(String[] args){
        System.out.println(getSn1(9));
        System.out.println(getSn2(5));
        System.out.println(getSn3(5));
        System.out.println(getSn4(5));
    }
}
