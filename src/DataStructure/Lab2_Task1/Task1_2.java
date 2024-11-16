package DataStructure.Lab2_Task1;

public class Task1_2 {
    // get the n^th value of the Fibonacci series
    // F(1) = 0
    // F(1) = 1
    // F(n) = F(n-1) + F(n-2)
    public static int getFibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
    // This method is used to display a Fibonaccci series based on
    // the parameter n. Ex. n=10 ==> 0 1 1 2 3 5 8 13 21 34
    public static void printFibonacci(int n) {
        if (n == 0) System.out.print("0 ");
        else if (n == 1) {
            printFibonacci(0);
            System.out.print("1 ");
        } else if (n > 1) {
            printFibonacci(n - 1);
            System.out.print(getFibonacci(n) + " ");
        }
    }
    public static void main(String[] args){
        printFibonacci(10);
    }
}
