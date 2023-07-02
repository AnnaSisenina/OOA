package seminar2.cw;

public class Tiger extends Cat {
    static int count;

    public Tiger(String name, int runDistance) {
        super(name, runDistance);
        count++;
    }
}
