package seminar6.hw.data;

import seminar6.hw.service.CalculationNumber;

import java.util.List;

public class Calculation<T extends CalculationNumber> extends HistoryElement{
    List<T> numbers;
    String result;
    String type;

    public Calculation(List<T> numbers, String result, String type) {
        this.numbers = numbers;
        this.result = result;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(type).append(", ");
        sb.append("Числа: ");
        for (Object number : numbers) {
            sb.append(number.toString());
            sb.append(", ");
        }
        sb.append("Результат: ").append(result).append("\n");
        return sb.toString();
    }
}
