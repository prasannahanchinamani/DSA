package numbersystem;

public class ConversionofNumbers {
    // base can be Binary(2), Octa(8), Hexa(16)
    public String convertDecimalNumberTo(int decimal, int base) {
        String conversion = "0123456789ABCDEF";
        String convert = "";

        // Handle special case
        if (decimal == 0) return "0";

        do {
            int d = decimal % base;
            convert = conversion.charAt(d) + convert;
            decimal = decimal / base;
        } while (decimal != 0);

        return convert;
    }

    // Example main method to test
    public static void main(String[] args) {
        ConversionofNumbers converter = new ConversionofNumbers();
        int num = 255;
        System.out.println("Decimal " + num + " to Binary:      " + converter.convertDecimalNumberTo(num, 2));
        System.out.println("Decimal " + num + " to Octal:       " + converter.convertDecimalNumberTo(num, 8));
        System.out.println("Decimal " + num + " to Hexadecimal: " + converter.convertDecimalNumberTo(num, 16));
    }
}
