package seminar6.hw.service;


import java.util.List;

public interface Sum <T extends CalculationNumber> {
    T sum(List<T> numbers);
}
