package Backtracking;

public class sudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3',' ',' ','7',' ',' ',' ',' '},
                {'6',' ',' ','1','9','5',' ',' ',' '},
                {' ','9','8',' ',' ',' ',' ','6',' '},
                {'8',' ',' ',' ','6',' ',' ',' ','3'},
                {'4',' ',' ','8',' ','3',' ',' ','1'},
                {'7',' ',' ',' ','2',' ',' ',' ','6'},
                {' ','6',' ',' ',' ',' ','2','8',' '},
                {' ',' ',' ','4','1','9',' ',' ','5'},
                {' ',' ',' ',' ','8',' ',' ','7','9'},
        };
//        char x = '2';
//        char y = '2';
//        if(Character.compare(x,y) == 0) {
//            System.out.println(x);
//        }
        sudokuSolverSolution sudo = new sudokuSolverSolution();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        sudo.solveSudoku(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class sudokuSolverSolution {

    public void solveSudoku(char[][] board) {
        solveSudokuHelpper(board,0,0);
    }

    private boolean solveSudokuHelpper(char[][] board, int row, int col) {
        if(row == 9) return true;
        if(col == 9) return solveSudokuHelpper(board,row + 1,0);
        if(board[row][col] != ' ') return solveSudokuHelpper(board, row,col + 1);
        for (char i = 1; i <= 9; i++) {
            if(isSafeShudoku(board,row,col,i)){
                board[row][col] = Integer.toString(i).charAt(0);
                if (solveSudokuHelpper(board,row,col+1)) return true;
                board[row][col] = ' '; // Backtracking
            }
        }
        return false;
    }

    private boolean isSafeShudoku(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            if (Character.compare(board[row][i],ch) == 0) return false;
            if (Character.compare(board[i][col],ch) == 0) return false;
        }
        int gridRow = row/3;
        int gridCol = col/3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Character.compare(board[3*gridRow+i][3*gridCol+j],ch) == 0) return false;
            }
        }
        return true;
    }
}
