public class KnightTourNoArray {
    static int n = 5; // board size
    static int[][] board = new int[n][n];

    // Check if move is inside board and not yet visited
    public static boolean isSafe(int row, int col) {
        return (row >= 0 && row < n && col >= 0 && col < n && board[row][col] == -1);
    }

    // Recursive function to solve Knight's Tour
    public static boolean solveKnightTour(int row, int col, int step) {
        if (step == n * n) { // all squares visited
            printBoard();
            return true;
        }

        // Move 1: Up 2, Right 1
        if (isSafe(row - 2, col + 1)) {
            board[row - 2][col + 1] = step;
            if (solveKnightTour(row - 2, col + 1, step + 1)) return true;
            board[row - 2][col + 1] = -1; // backtrack
        }

        // Move 2: Up 1, Right 2
        if (isSafe(row - 1, col + 2)) {
            board[row - 1][col + 2] = step;
            if (solveKnightTour(row - 1, col + 2, step + 1)) return true;
            board[row - 1][col + 2] = -1;
        }

        // Move 3: Down 1, Right 2
        if (isSafe(row + 1, col + 2)) {
            board[row + 1][col + 2] = step;
            if (solveKnightTour(row + 1, col + 2, step + 1)) return true;
            board[row + 1][col + 2] = -1;
        }

        // Move 4: Down 2, Right 1
        if (isSafe(row + 2, col + 1)) {
            board[row + 2][col + 1] = step;
            if (solveKnightTour(row + 2, col + 1, step + 1)) return true;
            board[row + 2][col + 1] = -1;
        }

        // Move 5: Down 2, Left 1
        if (isSafe(row + 2, col - 1)) {
            board[row + 2][col - 1] = step;
            if (solveKnightTour(row + 2, col - 1, step + 1)) return true;
            board[row + 2][col - 1] = -1;
        }

        // Move 6: Down 1, Left 2
        if (isSafe(row + 1, col - 2)) {
            board[row + 1][col - 2] = step;
            if (solveKnightTour(row + 1, col - 2, step + 1)) return true;
            board[row + 1][col - 2] = -1;
        }

        // Move 7: Up 1, Left 2
        if (isSafe(row - 1, col - 2)) {
            board[row - 1][col - 2] = step;
            if (solveKnightTour(row - 1, col - 2, step + 1)) return true;
            board[row - 1][col - 2] = -1;
        }

        // Move 8: Up 2, Left 1
        if (isSafe(row - 2, col - 1)) {
            board[row - 2][col - 1] = step;
            if (solveKnightTour(row - 2, col - 1, step + 1)) return true;
            board[row - 2][col - 1] = -1;
        }

        return false; // no move worked
    }

    // Print the board
    public static void printBoard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Initialize board with -1 (unvisited)
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = -1;

        // Start at (0, 0)
        board[0][0] = 0;
        if (!solveKnightTour(0, 0, 1)) {
            System.out.println("No solution found.");
        }
    }
}

// static int[] rowMoves = {-2, -1, 1, 2, 2, 1, -1, -2};
//     static int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};

//     public static boolean isSafe(int row, int col) {
//         return (row >= 0 && row < n && col >= 0 && col < n && board[row][col] == -1);
//     }

//     public static boolean solveKnightTour(int row, int col, int step) {
//         if (step == n * n) { // All squares visited
//             printBoard();
//             return true;
//         }

//         for (int i = 0; i < 8; i++) {
//             int nextRow = row + rowMoves[i];
//             int nextCol = col + colMoves[i];

//             if (isSafe(nextRow, nextCol)) {
//                 board[nextRow][nextCol] = step;
//                 if (solveKnightTour(nextRow, nextCol, step + 1)) {
//                     return true;
//                 }
//                 board[nextRow][nextCol] = -1; // Backtrack
//             }
//         }
//         return false;
//     }
