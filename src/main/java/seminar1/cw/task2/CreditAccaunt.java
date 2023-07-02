package seminar1.cw.task2;
//- calculate_interest() - метод для расчета процентов по кредиту.
// Должен рассчитывать процентную ставку от текущего баланса и вычитать полученную сумму из баланса.
// Если баланс отрицательный, то проценты начисляются на отрицательный баланс.

public class CreditAccaunt extends Accaunt{
    private double degreePercent;

    public CreditAccaunt(String owner, int number, double balance, double degreePercent){
        super(owner, number, balance);
        this.degreePercent = degreePercent;
    }

    public double getDegreePercent() {
        return degreePercent;
    }

    public void setDegreePercent(double degreePercent) {
        this.degreePercent = degreePercent;
    }

    public void calculateInteresr(){
        double result = getBalance()*degreePercent/100;
        withdraw(result);
    }

}

