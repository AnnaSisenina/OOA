package seminar6.hw.service;

public interface Conversion <T extends CalculationNumber> {
    BinaryNumber binaryConversion(T number);
}
