package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateDivide, который содержал методы для деления вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за деление одного типа.

public class DivideComplexNumber implements Divide{
    public ComplexNumber divideComplex(List<ComplexNumber> complexNumbers) {
        double validPart = (complexNumbers.get(0).validPart * complexNumbers.get(1).validPart + complexNumbers.get(0).imagePart * complexNumbers.get(1).imagePart) /
                (complexNumbers.get(1).validPart * complexNumbers.get(1).validPart + complexNumbers.get(1).imagePart * complexNumbers.get(1).imagePart);
        double imagePart = (complexNumbers.get(0).imagePart * complexNumbers.get(1).validPart - complexNumbers.get(0).validPart * complexNumbers.get(1).imagePart) /
                (complexNumbers.get(1).validPart * complexNumbers.get(1).validPart + complexNumbers.get(1).imagePart * complexNumbers.get(1).imagePart);
        ComplexNumber divide = new ComplexNumber(validPart, imagePart);
        return divide;
    }
}
