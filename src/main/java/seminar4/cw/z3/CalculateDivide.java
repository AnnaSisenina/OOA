package seminar4.cw.z3;
//Актуальное дз:
//1)расширить класс калькулятор на умножение
//2)расширить класс калькулятор на деление
//3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг, так и инт - тут необходимо подумать
// как наилучшим образом реализовать, что будет если будут приниматься округляемые Double/Float
// (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))

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
