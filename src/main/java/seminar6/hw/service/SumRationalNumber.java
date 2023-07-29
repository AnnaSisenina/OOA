package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateSum, который содержал методы для сложения вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за сложение одного типа.
public class SumRationalNumber implements Sum<RationalNumber>{

    @Override
    public RationalNumber sum(List<RationalNumber> numbers) {
        int sumInteger = numbers.get(0).integerPart + numbers.get(1).integerPart;
        int sumNumerator = numbers.get(0).numerator * numbers.get(1).denominator +
                numbers.get(1).numerator * numbers.get(0).denominator;
        int sumDenominator = numbers.get(0).denominator * numbers.get(1).denominator;
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
