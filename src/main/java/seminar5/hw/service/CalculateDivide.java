package seminar5.hw.service;

import java.util.List;

public class CalculateDivide<T> {
    public double divide(List<? extends Number> numbers) {
        double divide = (double) numbers.get(0);

        for (Number number : numbers) {
            if (numbers.indexOf(number) != 0)
                divide /= number.doubleValue();
        }
        return divide;
    }
}