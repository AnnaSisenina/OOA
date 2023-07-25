package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateMultipl, который содержал методы для умножения вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за умножение одного типа.
public class MultiplyComplexNumber implements Multiply{
    public ComplexNumber multiplComplexNumber(List<ComplexNumber> complexNumbers) {
        double validPart = (complexNumbers.get(0).validPart * complexNumbers.get(1).validPart - complexNumbers.get(0).imagePart * complexNumbers.get(1).imagePart);
        double imagePart = (complexNumbers.get(0).imagePart * complexNumbers.get(1).validPart + complexNumbers.get(0).validPart * complexNumbers.get(1).imagePart);
        ComplexNumber multipl = new ComplexNumber(validPart, imagePart);
        return multipl;
    }
}
