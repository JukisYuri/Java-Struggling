package DataStructure.Lab5;

public class TicTacToe {
    private static final char EMPTY = ' ';
    private char[][] board;

    public TicTacToe(char[][] board) {
        this.board = board;
    }

    /*
    * This method checks all rows and returns true if any of them are marked with all of a single player's markers.
    * Otherwise, returns false.
    */
    public boolean checkRows() {
        for (int i = 0; i < board.length; i++) {
            char c = board[i][0];
            if(c != EMPTY){
                int count = 0;
                for (int j = 1; j < board.length; j++) {
                    if(c == board[i][j]){
                        count++;
                    }
                }
                if(count == board.length){
                    return true;
                }
            }
        }
        return false;
    }
    /*
    * This method checks all columns and returns true if any of them are marked with all of a single player's.
    * Otherwise, returns false.
    */
    public boolean checkColumns() {
        for (int j = 0; j < board[0].length; j++) {
            char c = board[0][j];
            if(c != EMPTY){
                int count = 0;
                for (int i = 1; i < board.length; i++) {
                    if(c == board[i][j]){
                        count++;
                    }
                }
                if(count == board.length - 1){
                    return true;
                }
            }
        }
        return false;
    }
    /*
     * This method checks both diagonals and returns true if any of them are marked with all of a single player's markers.
     * Otherwise, returns false.
     */
    public boolean checkDiagonals() {
        // Check top-left to bottom-right
        char c1 = board[0][0];
        if (c1 != EMPTY) {
            int count1 = 1; // Bắt đầu đếm từ phần tử đầu tiên
            for (int i = 1; i < board.length; i++) {
                if (c1 == board[i][i]) {
                    count1++;
                }
            }
            if (count1 == board.length - 1) {
                return true;
            }
        }

        // Check bottom-left to top-right
        char c2 = board[0][board[0].length - 1];
        if (c2 != EMPTY) {
            int count2 = 1; // Bắt đầu đếm từ phần tử đầu tiên
            for (int i = 1; i < board.length; i++) {
                if (c2 == board[i][board.length - 1 - i]) {
                    count2++;
                }
            }
            if (count2 == board.length - 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        char[][] arr = new char[][]{
                {'x', 'x', 'x'},
                {' ', 'o', ' '},
                {'o', 'o', 'x'}
        };
        char[][] arr2 = new char[][]{
                {'o', 'x', 'x'},
                {' ', 'o', 'x'},
                {'o', 'o', 'x'}
        };
        char[][] arr3 = new char[][]{
                {'x', 'x', 'o'},
                {'x', 'o', ' '},
                {'o', ' ', ' '}
        };
        char[][] arr4 = new char[][]{
                {'o', 'x', 'o', 'x'},
                {'x', 'x', 'o', ' '},
                {'o', 'x', 'x', ' '},
                {'o', 'x', 'x', 'o'}
        };
        TicTacToe ticTacToe = new TicTacToe(arr3);
        TicTacToe ticTacToe2 = new TicTacToe(arr);
        TicTacToe ticTacToe3 = new TicTacToe(arr2);
        TicTacToe ticTacToe4 = new TicTacToe(arr4);
        System.out.println(ticTacToe2.checkRows());
        System.out.println(ticTacToe3.checkColumns());
        System.out.println(ticTacToe.checkDiagonals());
        System.out.println(ticTacToe4.checkColumns()); // Advance Task

    }
}
