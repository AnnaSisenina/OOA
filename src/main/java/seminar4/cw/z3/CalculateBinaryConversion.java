package seminar4.cw.z3;

public class CalculateBinaryConversion {
    public String BinaryConversion(String decimalNumber) {
        String binaryNumber = null;
        double exponent = 0.0;
        int mantissa = 0;
        int length = decimalNumber.length();
        int i = 0;
        boolean ifMantissa = false;
        while (i < length && !ifMantissa) {
            if (decimalNumber.charAt(i) == '.') {
                ifMantissa = true;
                i++;
            } else {
                mantissa = mantissa * 10 + Character.getNumericValue(decimalNumber.charAt(i));
                i++;
            }
        }
        int j = 1;
        while (i < length) {
            exponent = exponent + Character.getNumericValue(decimalNumber.charAt(i)) / (Math.pow(10, j));
            i++;
            j++;
        }
        if (exponent == 0.0)
            binaryNumber = mantissaToBinary(mantissa) + ".0";
        else
            binaryNumber = mantissaToBinary(mantissa) + exponentToBinary(exponent);
        return binaryNumber;
    }

    public String BinaryConversion(int decimalNumber) {
        return mantissaToBinary(decimalNumber);
    }

    public String BinaryConversion(double decimalNumber) {
        return BinaryConversion(Double.toString(decimalNumber));
    }

    public String BinaryConversion(float decimalNumber) {
        return BinaryConversion(Float.toString(decimalNumber));
    }

    private String exponentToBinary(double exponent) {
        StringBuilder binaryExponent = new StringBuilder();
        binaryExponent.append(".");
        while (binaryExponent.length() < 10) {
            exponent = exponent * 2;
            if (exponent > 1.0) {
                exponent = exponent - 1.0;
                binaryExponent.append(1);
            } else binaryExponent.append(0);
        }
        return binaryExponent.toString();
    }

    private String mantissaToBinary(int mantissa) {
        StringBuilder binaryMantissa = new StringBuilder();
        while (mantissa != 0) {
            binaryMantissa.append(mantissa % 2);
            mantissa = mantissa / 2;
        }
        binaryMantissa.reverse();
        return binaryMantissa.toString();
    }
}
