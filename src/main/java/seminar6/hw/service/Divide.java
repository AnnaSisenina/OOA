package seminar6.hw.service;

import java.util.List;

public interface Divide <T extends CalculationNumber> {
    T divide(List<T> numbers);
}
