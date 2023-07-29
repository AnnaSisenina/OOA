package seminar6.hw.service;

public class RealNumber extends CalculationNumber {
    Double number;

    public RealNumber(Double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "RealNumber{" +
                 number +
                '}';
    }
}
