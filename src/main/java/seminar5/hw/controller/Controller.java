package seminar5.hw.controller;

import seminar5.hw.service.CalculateBinaryConversion;
import seminar5.hw.service.CalculateDivide;
import seminar5.hw.service.CalculateMultipl;
import seminar5.hw.service.CalculateSum;

import java.util.List;

public class Controller {
    public void sum(List<Double> numbers) {
        CalculateSum<Double> calculateSum = new CalculateSum<Double>();
        System.out.println(calculateSum.sum(numbers));
    }

    public void divide(List<Double> numbers) {
        CalculateDivide<Double> calculateDivide = new CalculateDivide<Double>();
        System.out.println(calculateDivide.divide(numbers));
    }

    public void multipl(List<Double> numbers) {
        CalculateMultipl<Double> calculateMultipl = new CalculateMultipl<Double>();
        System.out.println(calculateMultipl.multipl(numbers));
    }

    public void binaryConversion(String number) {
        CalculateBinaryConversion calculateBinaryConversion = new CalculateBinaryConversion();
        System.out.println(calculateBinaryConversion.BinaryConversion(number));
    }
}
