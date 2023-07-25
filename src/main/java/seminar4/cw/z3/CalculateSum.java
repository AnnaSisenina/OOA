package seminar4.cw.z3;

import java.util.List;

public class CalculateSum<T> {
    // static T qwe; так нельзя делать))

    public double sum(List<? extends Number> numbers){  // любой тип, наследуемый от Number
        double sum = 0.0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}