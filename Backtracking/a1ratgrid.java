import java.util.Arrays;

public class a1ratgrid {
    public static int ratway(int[][] maze, int i, int j, char[][] path) {
        int n = maze.length;

        // Base Case 1: Out of bounds or blocked by a wall. This is a dead end.
        if (i == n || j == n || maze[i][j] == 0) {
            return 0; // No paths from here.
        }

        // Mark the current cell as part of the path.
        path[i][j] = 'x';

        // Base Case 2: Reached the destination. A valid path is found.
        if (i == n - 1 && j == n - 1) {
            System.out.println("--- Path Found ---");
            printArr(path);
            path[i][j] = '_'; // Backtrack before returning.
            return 1; // Count this one valid path.
        }

        // Recursive Step: Explore moving right and down.
        int w1 = ratway(maze, i, j + 1, path); // right
        int w2 = ratway(maze, i + 1, j, path); // down

        // Backtrack: Unmark the current cell so other paths can use it.
        path[i][j] = '_';

        // Return the total paths found from this cell.
        return w1 + w2;
    }

    // Utility function to print the path array.
    public static void printArr(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int[][] maze = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 0 },
            { 1, 1, 1, 1 }
        };

        char[][] path = new char[maze.length][maze.length];
        
        // **FIX**: Initialize the path array with '.' for clean output.
        for (char[] row : path) {
            Arrays.fill(row, '.');
        }

        System.out.println("Searching for paths...");
        // **FIX**: Call ratway only ONCE and store the result.
        int totalWays = ratway(maze, 0, 0, path);
        
        System.out.println("\nTotal paths found: " + totalWays);
    }
}