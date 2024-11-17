package JavaBasic.Excercise;

public class MessageCheck {
    public static void printMatrix(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] encodeArray(int n, String s) { //check lại code
        int row;
        if (s.length() % 5 != 0) {
            row = (s.length() / 5) + 1;
        } else {
            row = (s.length() / 5);
        }
        String[][] arr = new String[row][n];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 5; j++) {
                if (index < s.length()) {
                    char c = s.charAt(index);
                    if (Character.isSpaceChar(c)) {
                        arr[i][j] = "-";
                    } else {
                        arr[i][j] = String.valueOf(c);
                    }
                    index++;
                } else {
                    arr[i][j] = "-";
                }
            }
        }
        return new char[row][n];
    }

    public static void main(String[] arg) {
        printMatrix(encodeArray(5, "I am student"));
    }
}

