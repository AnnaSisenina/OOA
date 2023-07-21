package seminar5.hw.service;

import java.util.List;

public class CalculateMultipl<T> {

    public double multipl(List<? extends Number> numbers) {
        double multipl = 1.0;

        for (Number number : numbers) {
            multipl *= number.doubleValue();
        }
        return multipl;
    }
}