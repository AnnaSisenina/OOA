package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateDivide, который содержал методы для деления вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за деление одного типа.
public class DivideRationalNumber implements Divide{
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
