package seminar6.hw.service;

public class ComplexNumber extends CalculationNumber {
    Double validPart;
    Double imagePart;

    public ComplexNumber(Double validPart, Double imagePart) {
        this.validPart = validPart;
        this.imagePart = imagePart;
    }


    @Override
    public String toString() {
        if (imagePart > 0)
            return "ComplexNumber{" +
                    validPart +
                    "+" + imagePart + "i" +
                    '}';
        else
            return "ComplexNumber{" +
                    validPart +
                    imagePart + "i" +
                    '}';
    }
}
