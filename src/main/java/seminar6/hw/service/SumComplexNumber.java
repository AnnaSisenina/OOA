package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateSum, который содержал методы для сложения вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за сложение одного типа.
public class SumComplexNumber implements Sum<ComplexNumber> {

    @Override
    public ComplexNumber sum(List<ComplexNumber> numbers) {
        ComplexNumber sum = new ComplexNumber(0.0, 0.0);
        for (ComplexNumber complexNumber : numbers) {
            sum.validPart += complexNumber.validPart;
            sum.imagePart += complexNumber.imagePart;
        }
        return sum;
    }
}
