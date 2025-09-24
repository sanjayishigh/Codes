public class a1ComplexOperations {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);  // 4 + 5i
        Complex c2 = new Complex(2, 3);  // 2 + 3i

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        System.out.print("Sum: ");
        sum.display();

        System.out.print("Difference: ");
        diff.display();

        System.out.print("Product: ");
        prod.display();
    }
}

class Complex {
    int real;
    int imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    Complex multiply(Complex other) {
        int realPart = this.real * other.real - this.imag * other.imag;
        int imagPart = this.real * other.imag + this.imag * other.real;
        return new Complex(realPart, imagPart);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}
