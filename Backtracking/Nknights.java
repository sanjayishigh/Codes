public class Nknights {
    public static boolean issafe(char[][] board, int row, int col) {
        int n = board.length;

        // {-2, -1}, // 2 up, 1 left
        // {-2, +1}, // 2 up, 1 right
        // {-1, -2}, // 1 up, 2 left
        // {-1, +2}  // 1 up, 2 right

        // (-2, -1)
        if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1] == 'K') {
            return false;
        }

        // (-2, +1)
        if (row - 2 >= 0 && col + 1 < n && board[row - 2][col + 1] == 'K') {
            return false;
        }

        // (-1, -2)
        if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2] == 'K') {
            return false;
        }

        // (-1, +2)
        if (row - 1 >= 0 && col + 2 < n && board[row - 1][col + 2] == 'K') {
            return false;
        }

        return true;
    }

    public static void nKnights(char board[][], int row) {
        if (row == board.length) {
            printArr(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'K';
                nKnights(board, row + 1);
                board[row][j] = '.';
            }
        }

    }

    public static void printArr(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int n = 3;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nKnights(board, 0);
    }
}
