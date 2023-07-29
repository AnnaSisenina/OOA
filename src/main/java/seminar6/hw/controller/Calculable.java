package seminar6.hw.controller;

import seminar6.hw.service.ComplexNumber;
import seminar6.hw.service.RationalNumber;
import seminar6.hw.service.RealNumber;

import java.util.List;

public interface Calculable {
    String sumReal(List<RealNumber> numbers);
    String sumComplex(List<ComplexNumber> numbers);
    String sumRational(List<RationalNumber> numbers);
    String divideReal(List<RealNumber> numbers);
    String divideComplex(List<ComplexNumber> numbers);
    String divideRatio(List<RationalNumber> numbers);
    String multiplyReal(List<RealNumber> numbers);
    String multiplyComplex(List<ComplexNumber> numbers);
    String multiplyRational(List<RationalNumber> numbers);
    String binaryConversion(RealNumber number);
}
