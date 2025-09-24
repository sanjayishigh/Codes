public class towerofhanoi {
    public static void toh(int n, int A, int B, int C) {
        if (n > 0) {
            toh(n - 1, A, C, B); // move n-1 disks from A to B using C as helper
            System.out.println("Moved disk " + n + " from rod " + A + " to rod " + C);
            toh(n - 1, B, A, C); // move n-1 disks from B to C using A as helper
        }
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        toh(n, 1, 2, 3); // rods labeled 1, 2, 3
    }
}
