package seminar4.cw.z3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        1)расширить класс калькулятор на умножение
        2)расширить класс калькулятор на деление
        3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг,
        так и инт - тут необходимо подумать как наилучшим образом реализовать,
        что будет если будут приниматься округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
         */


        CalculateSum calculateSum = new CalculateSum();
        CalculateMultipl calculateMultipl = new CalculateMultipl();
        CalculateDivide calculateDivide = new CalculateDivide();
        CalculateBinaryConversion calculateBinaryConversion = new CalculateBinaryConversion();

        List<Integer> listInt = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();
        List<Number> listNumber = new ArrayList<>();

        for (int i = 1; i < 3; i++) {
            listInt.add(i);
            listDouble.add(((double) i));
            listNumber.add(i);
        }
        System.out.println("calculateSum.sum(listNumber) = " + calculateSum.sum(listDouble));
        System.out.println("calculateMultipl.multipl(listNumber) = " + calculateMultipl.multipl(listDouble));
        System.out.println("calculateDivide.divide(listDouble) = " + calculateDivide.divide(listDouble));
        System.out.println("calculateBinaryConversion.BinaryConversion(6) = " + calculateBinaryConversion.BinaryConversion(6.01));
    }
}
