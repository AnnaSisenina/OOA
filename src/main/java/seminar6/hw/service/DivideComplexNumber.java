package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateDivide, который содержал методы для деления вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за деление одного типа.

public class DivideComplexNumber implements Divide<ComplexNumber>{
    @Override
    public ComplexNumber divide(List<ComplexNumber> numbers) {
        double validPart = (numbers.get(0).validPart * numbers.get(1).validPart + numbers.get(0).imagePart * numbers.get(1).imagePart) /
                (numbers.get(1).validPart * numbers.get(1).validPart + numbers.get(1).imagePart * numbers.get(1).imagePart);
        double imagePart = (numbers.get(0).imagePart * numbers.get(1).validPart - numbers.get(0).validPart * numbers.get(1).imagePart) /
                (numbers.get(1).validPart * numbers.get(1).validPart + numbers.get(1).imagePart * numbers.get(1).imagePart);
        return new ComplexNumber(validPart, imagePart);
    }
}
