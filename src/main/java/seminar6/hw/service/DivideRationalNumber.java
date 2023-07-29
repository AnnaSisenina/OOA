package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateDivide, который содержал методы для деления вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за деление одного типа.
public class DivideRationalNumber implements Divide<RationalNumber>{

    @Override
    public RationalNumber divide(List<RationalNumber> numbers) {
        int divideNumerator = (numbers.get(0).numerator + numbers.get(0).integerPart * numbers.get(0).denominator)
                * numbers.get(1).denominator;
        int divideDenominator = numbers.get(0).denominator *
                (numbers.get(1).numerator + numbers.get(1).integerPart * numbers.get(1).denominator);
        int divideInteger = 0;
        if (divideNumerator > divideDenominator) {
            divideInteger = divideNumerator / divideDenominator;
            divideNumerator = divideNumerator % divideDenominator;
        } else if (divideNumerator == divideDenominator) {
            divideInteger = divideNumerator / divideDenominator;
            divideNumerator = 0;
            divideDenominator = 0;
        }
        return new RationalNumber(divideInteger, divideNumerator, divideDenominator);
    }
}
