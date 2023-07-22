package seminar5.hw.controller;

import seminar5.hw.data.Calculation;
import seminar5.hw.data.History;
import seminar5.hw.service.*;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    History history;

    public Controller(History history) {
        this.history = history;
    }

    public void showHistory() {
        System.out.println(history.toString());
    }

    public void sum(List<Double> numbers) {
        CalculateSum<Double> calculateSum = new CalculateSum<>();
        double sum = calculateSum.sum(numbers);
        System.out.println(sum);
        Calculation calculation = new Calculation(numbers, String.valueOf(sum), "Сложение");
        history.addToHistory(calculation);
    }

    public void sumOfComplex(List<ComplexNumber> numbers) {
        CalculateSum<ComplexNumber> calculateSum = new CalculateSum<ComplexNumber>();
        ComplexNumber sum = calculateSum.sumComplexNumber(numbers);
        System.out.println(sum.toString());
        Calculation calculation = new Calculation(numbers, String.valueOf(sum), "Сложение");
        history.addToHistory(calculation);
    }

    public void sumOfRatio(List<RationalNumber> numbers) {
        CalculateSum<RationalNumber> calculateSum = new CalculateSum<>();
        RationalNumber sum = calculateSum.sumRationalNumber(numbers);
        System.out.println(sum.toString());
        Calculation calculation = new Calculation(numbers, String.valueOf(sum), "Сложение");
        history.addToHistory(calculation);
    }

    public void divide(List<Double> numbers) {
        CalculateDivide<Double> calculateDivide = new CalculateDivide<Double>();
        double divide = calculateDivide.divide(numbers);
        System.out.println(divide);
        Calculation calculation = new Calculation(numbers, String.valueOf(divide), "Деление");
        history.addToHistory(calculation);
    }

    public void divideOfComplex(List<ComplexNumber> numbers) {
        CalculateDivide<ComplexNumber> calculateDivide = new CalculateDivide<>();
        ComplexNumber divide = calculateDivide.divideComplex(numbers);
        System.out.println(divide.toString());
        Calculation calculation = new Calculation(numbers, String.valueOf(divide), "Деление");
        history.addToHistory(calculation);
    }

    public void divideOfRatio(List<RationalNumber> numbers) {
        CalculateDivide<RationalNumber> calculateDivide = new CalculateDivide<>();
        RationalNumber divide = calculateDivide.divideRatio(numbers);
        System.out.println(divide.toString());
        Calculation calculation = new Calculation(numbers, String.valueOf(divide), "Деление");
        history.addToHistory(calculation);
    }

    public void multipl(List<Double> numbers) {
        CalculateMultipl<Double> calculateMultipl = new CalculateMultipl<>();
        double multipl = calculateMultipl.multipl(numbers);
        System.out.println(multipl);
        Calculation calculation = new Calculation(numbers, String.valueOf(multipl), "Умножение");
        history.addToHistory(calculation);
    }

    public void multiplOfComplex(List<ComplexNumber> numbers) {
        CalculateMultipl<ComplexNumber> calculateMultipl = new CalculateMultipl<>();
        ComplexNumber multipl = calculateMultipl.multiplComplexNumber(numbers);
        System.out.println(multipl.toString());
        Calculation calculation = new Calculation(numbers, String.valueOf(multipl), "Умножение");
        history.addToHistory(calculation);
    }

    public void multiplOfRatio(List<RationalNumber> numbers) {
        CalculateMultipl<RationalNumber> calculateMultipl = new CalculateMultipl<>();
        RationalNumber multipl = calculateMultipl.multiplRatioNumber(numbers);
        System.out.println(multipl.toString());
        Calculation calculation = new Calculation(numbers, String.valueOf(multipl), "Умножение");
        history.addToHistory(calculation);
    }

    public void binaryConversion(String number) {
        CalculateBinaryConversion calculateBinaryConversion = new CalculateBinaryConversion();
        String binaryNumber = calculateBinaryConversion.BinaryConversion(number);
        System.out.println(binaryNumber);
        List<String> numbers = new ArrayList<>();
        numbers.add(binaryNumber);
        Calculation calculation = new Calculation(numbers, binaryNumber, "Перевод в бинарное");
        history.addToHistory(calculation);
    }

}
