package seminar6.hw.service;

// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateDivide, который содержал методы для деления вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за деление одного типа.

public class ConversionRealToBinary implements Conversion<RealNumber>{

    @Override
    public BinaryNumber binaryConversion(RealNumber number) {
        return BinaryConversion(Double.toString(number.number));
    }
    public BinaryNumber BinaryConversion(String decimalNumber) {
        String binaryNumber;
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
            binaryNumber = mantissaToBinary(mantissa) + ".0(b)";
        else
            binaryNumber = mantissaToBinary(mantissa) + exponentToBinary(exponent) + "(b)";
        return new BinaryNumber(binaryNumber);
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
        if (mantissa == 0) binaryMantissa.append(0);
        while (mantissa != 0) {
            binaryMantissa.append(mantissa % 2);
            mantissa = mantissa / 2;
        }
        binaryMantissa.reverse();
        return binaryMantissa.toString();
    }


}
