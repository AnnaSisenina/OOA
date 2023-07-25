package seminar6.hw.service;

public class BinaryNumber extends CalculationNumber{
    String binaryNumber;

    public BinaryNumber(String binaryNumber) {
        this.binaryNumber = binaryNumber;
    }

    @Override
    public String toString() {
        return "BinaryNumber{" +
                binaryNumber + '}';
    }
}
