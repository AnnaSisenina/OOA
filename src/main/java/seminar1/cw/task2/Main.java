package seminar1.cw.task2;

public class Main {
    public static void main(String[] args) {
        CreditAccaunt credit = new CreditAccaunt("Иван Иванов", 123451, 1000,10.0);
        SafeAccaunt safe = new SafeAccaunt("Иван Иванов", 34561, 3000, 10);

        System.out.println(credit.getBalance());
        credit.calculateInteresr();
        System.out.println(credit.getBalance());
        System.out.println(safe.getBalance());
        safe.addInterest();
        System.out.println(safe.getBalance());
    }
}
