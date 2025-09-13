package RadixConversion;

public class BaseConversion {

    public static String convert(String input, int fromBase, int toBase) {
        int decimalValue = Integer.parseInt(input, fromBase);
        if (toBase == 2) {
            return Integer.toBinaryString(decimalValue);
        } else if (toBase == 10) {
            return Integer.toString(decimalValue);
        } else if (toBase == 16) {
            return Integer.toHexString(decimalValue).toUpperCase();
        } else {
            throw new IllegalArgumentException("Unsupported base: " + toBase);
        }
    }
}