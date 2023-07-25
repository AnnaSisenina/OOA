package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateDivide, который содержал методы для деления вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за деление одного типа.
public class DivideRealNumber implements Divide{
    public RealNumber divide(List<RealNumber> numbers) {
        RealNumber divide = numbers.get(0);
        for (RealNumber number : numbers) {
            if (numbers.indexOf(number) != 0) {
                divide.number /= number.number;
            }
        }
        return divide;
    }
}
