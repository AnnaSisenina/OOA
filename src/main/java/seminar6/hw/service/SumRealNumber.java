package seminar6.hw.service;

import java.util.List;
// Реализация принципа Single Responsibility Principle
// Был общий класс CalculateSum, который содержал методы для сложения вещественных, рациональных и комплексных чисел.
// Разделила его на три отдельных класса, каждый класс отвечает за сложение одного типа.
public class SumRealNumber implements Sum<RealNumber> {
    @Override
    public RealNumber sum(List<RealNumber> numbers) {
        RealNumber sum = new RealNumber(0.0);
        for (RealNumber number : numbers) {
            sum.number += number.number;
        }
        return sum;
    }
}
