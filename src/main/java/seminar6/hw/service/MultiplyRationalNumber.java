package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateMultipl, который содержал методы для умножения вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за умножение одного типа.
public class MultiplyRationalNumber implements Multiply{
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
