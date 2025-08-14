public class Nqueens1solution {
    public static Boolean issafe(char board[][],int row,int col){
        //Vertical
        for(int i=row-1; i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //Diagonal left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //Diagonal right
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static int count = 0;

    public static Boolean nQueens(char board[][], int row) {
        if (row == board.length) {
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row + 1)){
                    return true;
                }
                board[row][j] = '.';
            }
        }

        return false;
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
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        if(nQueens(board, 0)){
            System.out.println("Solution is possible");
            printArr(board);
        }else{
            System.out.print("Solution is not possible");
        }
        
    }
    
}
