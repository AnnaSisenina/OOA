package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateSum, который содержал методы для сложения вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за сложение одного типа.
public class SumRationalNumber implements Sum{
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
        return new RationalNumber(sumInteger, sumNumerator, sumDenominator);
    }
}
