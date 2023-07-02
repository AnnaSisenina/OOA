package seminar1.cw.task2;

public class Accaunt {
    private String owner;
    private int number;
    private double balance;

    public Accaunt() {

    }

    public Accaunt(String owner, int number, double balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }



    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount){
        if (this.balance >= amount) {
            this.balance -= amount;
        }
        else{
            System.out.println("Недостаточно средств\n Остаток на счете: " + this.balance);
        }
    }

    @Override
    public String toString() {
        return "Accaunt{" +
                "owner='" + owner + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }

}
