package seminar6.hw.controller;

import seminar6.hw.data.Calculation;
import seminar6.hw.data.History;
import seminar6.hw.service.*;

import java.util.ArrayList;
import java.util.List;

public class LogController implements Calculable, Loggable{
    History<Calculation<? extends CalculationNumber>> history;
    Controller controller;

    public LogController(History<Calculation<? extends CalculationNumber>> history, Controller controller) {
        this.history = history;
        this.controller = controller;
    }
    @Override
    public void showHistory() {
        System.out.println(history.toString());
    }
    @Override
    public String sumReal(List<RealNumber> numbers) {
        String sum = controller.sumReal(numbers);
        Calculation<RealNumber> calculation = new Calculation<>(numbers, sum, "Сложение");
        history.addToHistory(calculation);
        return sum;
    }
    @Override
    public String sumComplex(List<ComplexNumber> numbers) {
        String sum = controller.sumComplex(numbers);
        Calculation<ComplexNumber> calculation = new Calculation<>(numbers, sum, "Сложение");
        history.addToHistory(calculation);
        return sum;
    }
    @Override
    public String sumRational(List<RationalNumber> numbers) {
        String sum = controller.sumRational(numbers);
        Calculation<RationalNumber> calculation = new Calculation<>(numbers, sum, "Сложение");
        history.addToHistory(calculation);
        return sum;
    }
    @Override
    public String divideReal(List<RealNumber> numbers) {
        String divide = controller.divideReal(numbers);
        Calculation <RealNumber> calculation = new Calculation<>(numbers, divide, "Деление");
        history.addToHistory(calculation);
        return divide;
    }
    @Override
    public String divideComplex(List<ComplexNumber> numbers) {
        String divide = controller.divideComplex(numbers);
        Calculation<ComplexNumber> calculation = new Calculation<>(numbers, divide, "Деление");
        history.addToHistory(calculation);
        return divide;
    }
    @Override
    public String divideRatio(List<RationalNumber> numbers) {
        String divide = controller.divideRatio(numbers);
        Calculation<RationalNumber> calculation = new Calculation<>(numbers, divide.toString(), "Деление");
        history.addToHistory(calculation);
        return divide;
    }
    @Override
    public String multiplyReal(List<RealNumber> numbers) {
        String multiply = controller.multiplyReal(numbers);
        Calculation<RealNumber> calculation = new Calculation<>(numbers, multiply, "Умножение");
        history.addToHistory(calculation);
        return multiply;
    }
    @Override
    public String multiplyComplex(List<ComplexNumber> numbers) {
        String multiply = controller.multiplyComplex(numbers);
        Calculation <ComplexNumber> calculation = new Calculation<>(numbers, multiply, "Умножение");
        history.addToHistory(calculation);
        return multiply;
    }
    @Override
    public String multiplyRational(List<RationalNumber> numbers) {
        String multiply = controller.multiplyRational(numbers);
        Calculation <RationalNumber> calculation = new Calculation<>(numbers, multiply, "Умножение");
        history.addToHistory(calculation);
        return multiply;
    }
    @Override
    public String binaryConversion(RealNumber number) {
        String binaryNumber = controller.binaryConversion(number);
        List<RealNumber> numbers = new ArrayList<>();
        numbers.add(number);
        Calculation <RealNumber> calculation = new Calculation<>(numbers, binaryNumber, "Перевод в бинарное");
        history.addToHistory(calculation);
        return binaryNumber;
    }


}
