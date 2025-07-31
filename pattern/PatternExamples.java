public class PatternExamples {

    // 1. Number Pattern: Increasing Triangle
    static void numberIncreasingTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // 2. Number Pattern: Inverted Triangle
    static void numberInvertedTriangle() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // 3. Number Pattern: Right Aligned Triangle
    static void numberRightAligned() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }

    // 4. Floyd's Triangle
    static void floydsTriangle() {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    // 5. Star Pattern: Square
    static void starSquare() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 6. Star Pattern: Right-angled Triangle
    static void starRightTriangle() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 7. Star Pattern: Inverted Triangle
    static void starInvertedTriangle() {
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 8. Star Pattern: Pyramid
    static void starPyramid() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 9. Star Pattern: Diamond
    static void starDiamond() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 10. Character Pattern: Alphabet Triangle
    static void charAlphabetTriangle() {
        for (int i = 0; i < 4; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // 11. Character Pattern: Alphabet Pyramid
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
        numberIncreasingTriangle();
        numberInvertedTriangle();
        numberRightAligned();
        floydsTriangle();
        starSquare();
        starRightTriangle();
        starInvertedTriangle();
        starPyramid();
        starDiamond();
        charAlphabetTriangle();
        charAlphabetPyramid();
        pascalTriangle();
        palindromicNumberPyramid();
        hollowRectangle();
        hollowPyramid();
        butterflyPattern();
        zigZagPattern();
    }
}
