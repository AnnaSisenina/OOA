package seminar6.hw.controller;

import seminar6.hw.data.Calculation;
import seminar6.hw.data.History;
import seminar6.hw.service.*;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    History<Calculation<? extends CalculationNumber>> history;

    public Controller(History<Calculation<? extends CalculationNumber>> history) {
        this.history = history;
    }

    public void showHistory() {
        System.out.println(history.toString());
    }

    public void sumReal(List<RealNumber> numbers) {
        SumRealNumber calculateSum = new SumRealNumber();
        RealNumber sum = calculateSum.sum(numbers);
        System.out.println(sum.toString());
        Calculation<RealNumber> calculation = new Calculation<>(numbers, sum.toString(), "Сложение");
        history.addToHistory(calculation);
    }

    public void sumComplex(List<ComplexNumber> numbers) {
        SumComplexNumber calculateSum = new SumComplexNumber();
        ComplexNumber sum = calculateSum.sumComplexNumber(numbers);
        System.out.println(sum.toString());
        Calculation<ComplexNumber> calculation = new Calculation<>(numbers, sum.toString(), "Сложение");
        history.addToHistory(calculation);
    }

    public void sumRational(List<RationalNumber> numbers) {
        SumRationalNumber calculateSum = new SumRationalNumber();
        RationalNumber sum = calculateSum.sumRationalNumber(numbers);
        System.out.println(sum.toString());
        Calculation<RationalNumber> calculation = new Calculation<>(numbers, sum.toString(), "Сложение");
        history.addToHistory(calculation);
    }

    public void divideReal(List<RealNumber> numbers) {
        DivideRealNumber calculateDivide = new DivideRealNumber();
        RealNumber divide = calculateDivide.divide(numbers);
        System.out.println(divide);
        Calculation <RealNumber> calculation = new Calculation<>(numbers, divide.toString(), "Деление");
        history.addToHistory(calculation);
    }

    public void divideComplex(List<ComplexNumber> numbers) {
        DivideComplexNumber calculateDivide = new DivideComplexNumber();
        ComplexNumber divide = calculateDivide.divideComplex(numbers);
        System.out.println(divide.toString());
        Calculation<ComplexNumber> calculation = new Calculation<>(numbers, divide.toString(), "Деление");
        history.addToHistory(calculation);
    }

    public void divideRatio(List<RationalNumber> numbers) {
        DivideRationalNumber calculateDivide = new DivideRationalNumber();
        RationalNumber divide = calculateDivide.divideRatio(numbers);
        System.out.println(divide.toString());
        Calculation<RationalNumber> calculation = new Calculation<>(numbers, divide.toString(), "Деление");
        history.addToHistory(calculation);
    }

    public void multiplyReal(List<RealNumber> numbers) {
        MultiplyRealNumber calculateMultiply = new MultiplyRealNumber();
        RealNumber multiply = calculateMultiply.multiplyRealNumber(numbers);
        System.out.println(multiply);
        Calculation<RealNumber> calculation = new Calculation<>(numbers, multiply.toString(), "Умножение");
        history.addToHistory(calculation);
    }

    public void multiplyComplex(List<ComplexNumber> numbers) {
        MultiplyComplexNumber calculateMultiply = new MultiplyComplexNumber();
        ComplexNumber multiply = calculateMultiply.multiplComplexNumber(numbers);
        System.out.println(multiply.toString());
        Calculation <ComplexNumber> calculation = new Calculation<>(numbers, multiply.toString(), "Умножение");
        history.addToHistory(calculation);
    }

    public void multiplyRational(List<RationalNumber> numbers) {
        MultiplyRationalNumber calculateMultiply = new MultiplyRationalNumber();
        RationalNumber multiply = calculateMultiply.multiplRatioNumber(numbers);
        System.out.println(multiply.toString());
        Calculation <RationalNumber> calculation = new Calculation<>(numbers, multiply.toString(), "Умножение");
        history.addToHistory(calculation);
    }

    public void binaryConversion(RealNumber number) {
        ConversionRealToBinary calculateBinaryConversion = new ConversionRealToBinary();
        BinaryNumber binaryNumber = calculateBinaryConversion.BinaryConversion(number);
        System.out.println(binaryNumber);
        List<RealNumber> numbers = new ArrayList<>();
        numbers.add(number);
        Calculation <RealNumber> calculation = new Calculation<>(numbers, binaryNumber.toString(), "Перевод в бинарное");
        history.addToHistory(calculation);
    }

}
