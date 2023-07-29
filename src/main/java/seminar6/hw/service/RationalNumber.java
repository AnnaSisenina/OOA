package seminar6.hw.service;

public class RationalNumber extends CalculationNumber {
    int integerPart;
    int numerator;
    int denominator;

    public RationalNumber(int integerPart, int numerator, int denominator) {
        this.integerPart = integerPart;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                integerPart +
                " " + numerator +
                "/" + denominator +
                '}';
    }
}
