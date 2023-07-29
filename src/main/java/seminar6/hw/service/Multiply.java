package seminar6.hw.service;

import java.util.List;

public interface Multiply <T extends CalculationNumber>{
    T multiply(List<T> numbers);
}
