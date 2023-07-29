package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateMultipl, который содержал методы для умножения вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за умножение одного типа.
public class MultiplyRationalNumber implements Multiply<RationalNumber>{
    @Override
    public RationalNumber multiply(List<RationalNumber> numbers) {
        int multiplNumerator = (numbers.get(0).numerator + numbers.get(0).integerPart * numbers.get(0).denominator)
                * (numbers.get(1).numerator + numbers.get(1).integerPart * numbers.get(1).denominator);
        int multiplDenominator = numbers.get(0).denominator * numbers.get(1).denominator;
        int multiplInteger = 0;
        if (multiplNumerator > multiplDenominator) {
            multiplInteger = multiplNumerator / multiplDenominator;
            multiplNumerator = multiplNumerator % multiplDenominator;
        } else if (multiplNumerator == multiplDenominator) {
            multiplInteger = multiplNumerator / multiplDenominator;
            multiplNumerator = 0;
            multiplDenominator = 0;
        }
        return new RationalNumber(multiplInteger, multiplNumerator, multiplDenominator);
    }
}
