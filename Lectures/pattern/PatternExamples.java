public class PatternExamples {

    //base n*n pattern
   public static void square(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // triangle star pattern
    public static void lowertraingle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // upper triangle star pattern
    public static void uppertriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // num pattern lower triangle
    public static void numpattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // num pattern upper triangle
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // pyramid
    public static void pyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <=i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // diamond
    public static void diamond(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i+1; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // Character Pattern: Alphabet Triangle
    static void charAlphabetTriangle() {
        for (int i = 0; i < 4; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // Character Pattern: Alphabet Pyramid
    static void charAlphabetPyramid() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 4 - i; j++) System.out.print(" ");
            for (char ch = 'A'; ch <= 'A' + i; ch++) System.out.print(ch);
            for (char ch = (char)('A' + i - 1); ch >= 'A'; ch--) System.out.print(ch);
            System.out.println();
        }
    }

    // 12. Pascal's Triangle
    static void pascalTriangle() {
        for (int i = 0; i < 5; i++) {
            int num = 1;
            for (int j = 1; j < 5 - i; j++) System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // 13. Palindromic Number Pyramid
    static void palindromicNumberPyramid() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) System.out.print(" ");
            for (int j = i; j >= 1; j--) System.out.print(j);
            for (int j = 2; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }

    // 14. Hollow Rectangle
    static void hollowRectangle() {
        int rows = 4, cols = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 14. Hollow Parellelogram
    static void hollowparallelogram() {
            int n =4, m=5;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<= n-i;j++) System.out.print(" ");
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    

    // 15. Hollow Pyramid
    static void hollowPyramid() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 16. Butterfly Pattern
    static void butterflyPattern() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 17. Zig-Zag Pattern
    static void zigZagPattern() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
    }
}
