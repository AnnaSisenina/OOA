package seminar6.hw.controller;

import seminar6.hw.data.Calculation;
import seminar6.hw.data.History;
import seminar6.hw.service.*;

import java.util.ArrayList;
import java.util.List;

public class Controller implements Calculable{

    @Override
    public String sumReal(List<RealNumber> numbers) {
        SumRealNumber calculateSum = new SumRealNumber();
        RealNumber sum = calculateSum.sum(numbers);
        return sum.toString();
    }
    @Override
    public String sumComplex(List<ComplexNumber> numbers) {
        SumComplexNumber calculateSum = new SumComplexNumber();
        ComplexNumber sum = calculateSum.sum(numbers);
        return sum.toString();
    }
    @Override
    public String sumRational(List<RationalNumber> numbers) {
        SumRationalNumber calculateSum = new SumRationalNumber();
        RationalNumber sum = calculateSum.sum(numbers);
        return sum.toString();
    }
    @Override
    public String divideReal(List<RealNumber> numbers) {
        DivideRealNumber calculateDivide = new DivideRealNumber();
        RealNumber divide = calculateDivide.divide(numbers);
        return divide.toString();
    }
    @Override
    public String divideComplex(List<ComplexNumber> numbers) {
        DivideComplexNumber calculateDivide = new DivideComplexNumber();
        ComplexNumber divide = calculateDivide.divide(numbers);
        return divide.toString();
    }
    @Override
    public String divideRatio(List<RationalNumber> numbers) {
        DivideRationalNumber calculateDivide = new DivideRationalNumber();
        RationalNumber divide = calculateDivide.divide(numbers);
        return divide.toString();
    }
    @Override
    public String multiplyReal(List<RealNumber> numbers) {
        MultiplyRealNumber calculateMultiply = new MultiplyRealNumber();
        RealNumber multiply = calculateMultiply.multiply(numbers);
        return multiply.toString();
    }
    @Override
    public String multiplyComplex(List<ComplexNumber> numbers) {
        MultiplyComplexNumber calculateMultiply = new MultiplyComplexNumber();
        ComplexNumber multiply = calculateMultiply.multiply(numbers);
        return multiply.toString();
    }
    @Override
    public String multiplyRational(List<RationalNumber> numbers) {
        MultiplyRationalNumber calculateMultiply = new MultiplyRationalNumber();
        RationalNumber multiply = calculateMultiply.multiply(numbers);
        return multiply.toString();
    }
    @Override
    public String binaryConversion(RealNumber number) {
        ConversionRealToBinary calculateBinaryConversion = new ConversionRealToBinary();
        BinaryNumber binaryNumber = calculateBinaryConversion.binaryConversion(number);
        return binaryNumber.toString();
    }


}
