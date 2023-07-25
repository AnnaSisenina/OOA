package seminar5.hw.data;

import java.util.List;

public class Calculation {
    List numbers;
    String result;
    String type;

    public Calculation(List numbers, String result, String type) {
        this.numbers = numbers;
        this.result = result;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(type + ", ");
        sb.append("Числа: ");
        for (Object number : numbers) {
            sb.append(number.toString());
            sb.append(", ");
        }
        sb.append("Результат: " + result + "\n");
        return sb.toString();
    }
}
