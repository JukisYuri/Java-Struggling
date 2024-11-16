package YourselfLearning.Lab2_Task2;

public class Task2 {
    // Hàm đệ quy để vẽ từng dòng của kim tự tháp với ký tự 'X'
    public static void drawLine(int n, int currentLine, char c) {
        if (currentLine > n) {
            return;
        }
        printRepeatChar(n - currentLine, ' ');
        printRepeatChar(2 * currentLine - 1, c);
        System.out.println();
        drawLine(n, currentLine + 1, c);
    }
     // Hàm đệ quy để vẽ từng dòng của kim tự tháp có số
     public static void drawLineWithNumber(int n, int currentLine) {
        if (currentLine > n) {
            return;
        }
        printRepeatChar(n - currentLine, ' ');
        printWithSpace(currentLine, currentLine);
        System.out.println();
        drawLineWithNumber(n, currentLine + 1);
    }
     // Hàm đệ quy để in ký tự nhiều lần
     public static void printRepeatChar(int count, char c) {
        if (count == 0) {
            return;
        }
        System.out.print(c);
        printRepeatChar(count - 1, c);
    }
    // Hàm đệ quy để in số với khoảng trắng giữa các số
    public static void printWithSpace(int number, int count) {
        if (count == 0) {
            return;
        }
        System.out.print(number);
        if (count > 1) {
            System.out.print(" ");
        }
        printWithSpace(number, count - 1);
    }
    // Hàm chính để vẽ kim tự tháp có ký tự 'X'
    public static void drawPyramid(int n) {
        drawLine(n, 1, 'X');
    }
    // Hàm chính để vẽ kim tự tháp có số
    public static void drawPyramidHasNumber(int n) {
        drawLineWithNumber(n, 1);
    }
    public static void main(String[] args) {
        int n = 4; int m = 8;
        System.out.println("Pyramid with 'X':"); drawPyramid(n);
        System.out.println("\nPyramid with numbers:"); drawPyramidHasNumber(m);
        }
    }

