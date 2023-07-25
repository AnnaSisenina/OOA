package seminar5.hw.service;

import java.util.List;

public class CalculateSum<T> {
    // static T qwe; так нельзя делать))

    public double sum(List<? extends Number> numbers) {
        double sum = 0.0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public ComplexNumber sumComplexNumber(List<ComplexNumber> complexNumbers) {
        ComplexNumber sum = new ComplexNumber(0.0, 0.0);
        for (ComplexNumber complexNumber : complexNumbers) {
            sum.validPart += complexNumber.validPart;
            sum.imagePart += complexNumber.imagePart;
        }
        return sum;
    }

    public RationalNumber sumRationalNumber(List<RationalNumber> inputRatioNumbers) {
        int sumInteger = inputRatioNumbers.get(0).integerPart + inputRatioNumbers.get(1).integerPart;
        int sumNumerator = inputRatioNumbers.get(0).numerator * inputRatioNumbers.get(1).denominator +
                inputRatioNumbers.get(1).numerator * inputRatioNumbers.get(0).denominator;
        int sumDenominator = inputRatioNumbers.get(0).denominator * inputRatioNumbers.get(1).denominator;
        if (sumNumerator > sumDenominator) {
            sumInteger = sumInteger + sumNumerator / sumDenominator;
            sumNumerator = sumNumerator % sumDenominator;
        } else if (sumNumerator == sumDenominator) {
            sumInteger = sumInteger + sumNumerator / sumDenominator;
            sumNumerator = 0;
            sumDenominator = 0;
        }

        RationalNumber sum = new RationalNumber(sumInteger, sumNumerator, sumDenominator);
        return sum;
    }
}