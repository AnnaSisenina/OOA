package seminar5.hw.service;

import java.util.List;

public class CalculateMultipl<T> {

    public double multipl(List<? extends Number> numbers) {
        double multipl = 1.0;

        for (Number number : numbers) {
            multipl *= number.doubleValue();
        }
        return multipl;
    }

    public ComplexNumber multiplComplexNumber(List<ComplexNumber> complexNumbers) {
        double validPart = (complexNumbers.get(0).validPart * complexNumbers.get(1).validPart - complexNumbers.get(0).imagePart * complexNumbers.get(1).imagePart);
        double imagePart = (complexNumbers.get(0).imagePart * complexNumbers.get(1).validPart + complexNumbers.get(0).validPart * complexNumbers.get(1).imagePart);
        ComplexNumber multipl = new ComplexNumber(validPart, imagePart);
        return multipl;
    }

    public RationalNumber multiplRatioNumber(List<RationalNumber> inputRatioNumbers) {
        int multiplNumerator = (inputRatioNumbers.get(0).numerator + inputRatioNumbers.get(0).integerPart * inputRatioNumbers.get(0).denominator)
                * (inputRatioNumbers.get(1).numerator + inputRatioNumbers.get(1).integerPart * inputRatioNumbers.get(1).denominator);
        int multiplDenominator = inputRatioNumbers.get(0).denominator * inputRatioNumbers.get(1).denominator;
        int multiplInteger = 0;
        if (multiplNumerator > multiplDenominator) {
            multiplInteger = multiplNumerator / multiplDenominator;
            multiplNumerator = multiplNumerator % multiplDenominator;
        } else if (multiplNumerator == multiplDenominator) {
            multiplInteger = multiplNumerator / multiplDenominator;
            multiplNumerator = 0;
            multiplDenominator = 0;
        }

        RationalNumber multiplRatioNumber = new RationalNumber(multiplInteger, multiplNumerator, multiplDenominator);
        return multiplRatioNumber;
    }
}