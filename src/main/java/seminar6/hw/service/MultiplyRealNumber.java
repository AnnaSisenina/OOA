package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateMultipl, который содержал методы для умножения вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за умножение одного типа.
public class MultiplyRealNumber implements Multiply<RealNumber>{
    @Override
    public RealNumber multiply(List<RealNumber> numbers) {
        RealNumber multiply = new RealNumber(1.0);
        for (RealNumber number : numbers) {
            multiply.number *= number.number;
        }
        return multiply;
    }
}
