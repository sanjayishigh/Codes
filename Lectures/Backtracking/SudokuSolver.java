public class SudokuSolver {

    public static void main(String[] args) {
        // The initial Sudoku puzzle board from your screenshot
        int[][] sudoku = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists:");
            printBoard(sudoku);
        } else {
            System.out.println("Solution does not exist");
        }
    }

    // The main recursive backtracking function
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // Base Case: If we have reached the 9th row, we are done
        if (row == 9) {
            return true;
        }

        // Calculate the next cell to visit
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // If the current cell is not empty, move to the next one
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // Try placing digits 1-9 in the empty cell
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                // Recursively call for the next cell
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true; // If a solution is found, stop
                }
                // Backtrack: If the path didn't lead to a solution, undo the move
                sudoku[row][col] = 0;
            }
        }

        return false; // Triggers backtracking
    }

    // Checks if placing a digit is valid according to Sudoku rules
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // Check column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Check 3x3 grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true; // The placement is safe
    }

    // Utility function to print the solved board
    public static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}