package seminar2.cw2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Car car = new Car();
        human.drive(car);
        human.drive(car);
        Bicycle bicycle = new Bicycle();
        human.stop();
        human.stop();
    }
}
