public class NumberConverter {

    public static void binaryToDecimal(int num) {
        int decimal = 0;
        int power = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            num /= 10;
        }

        System.out.println("Decimal: " + decimal);
    }

    public static void decimalToBinary(int num) {
        int binary = 0;
        int power = 0;

        while (num > 0) {
            int rem = num % 2;
            binary += rem * Math.pow(10, power);
            power++;
            num /= 2;
        }

        System.out.println("Binary: " + binary);
    }

    public static void main(String[] args) {
        int binaryInput = 110011;
        System.out.print("Binary to Decimal: ");
        binaryToDecimal(binaryInput);  

        int decimalInput = 8;
        System.out.print("Decimal to Binary: ");
        decimalToBinary(decimalInput);
    }
}
