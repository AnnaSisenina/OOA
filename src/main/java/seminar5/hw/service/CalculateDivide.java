package seminar5.hw.service;

import java.util.List;

public class CalculateDivide<T> {
    public double divide(List<? extends Number> numbers) {
        double divide = (double) numbers.get(0);

        for (Number number : numbers) {
            if (numbers.indexOf(number) != 0)
                divide /= number.doubleValue();
        }
        return divide;
    }

    public ComplexNumber divideComplex(List<ComplexNumber> complexNumbers) {
        double validPart = (complexNumbers.get(0).validPart * complexNumbers.get(1).validPart + complexNumbers.get(0).imagePart * complexNumbers.get(1).imagePart) /
                (complexNumbers.get(1).validPart * complexNumbers.get(1).validPart + complexNumbers.get(1).imagePart * complexNumbers.get(1).imagePart);
        double imagePart = (complexNumbers.get(0).imagePart * complexNumbers.get(1).validPart - complexNumbers.get(0).validPart * complexNumbers.get(1).imagePart) /
                (complexNumbers.get(1).validPart * complexNumbers.get(1).validPart + complexNumbers.get(1).imagePart * complexNumbers.get(1).imagePart);
        ComplexNumber divide = new ComplexNumber(validPart, imagePart);
        return divide;
    }

    public RationalNumber divideRatio(List<RationalNumber> inputRatioNumbers) {
        int divideNumerator = (inputRatioNumbers.get(0).numerator + inputRatioNumbers.get(0).integerPart * inputRatioNumbers.get(0).denominator)
                * inputRatioNumbers.get(1).denominator;
        int divideDenominator = inputRatioNumbers.get(0).denominator *
                (inputRatioNumbers.get(1).numerator + inputRatioNumbers.get(1).integerPart * inputRatioNumbers.get(1).denominator);
        int divideInteger = 0;
        if (divideNumerator > divideDenominator) {
            divideInteger = divideNumerator / divideDenominator;
            divideNumerator = divideNumerator % divideDenominator;
        } else if (divideNumerator == divideDenominator) {
            divideInteger = divideNumerator / divideDenominator;
            divideNumerator = 0;
            divideDenominator = 0;
        }
        RationalNumber divideRatio = new RationalNumber(divideInteger, divideNumerator, divideDenominator);
        return divideRatio;
    }
}