package seminar2.cw;

public class DomesticCat extends Cat{
    static int count;

    public DomesticCat(String name, int runDistance) {
        super(name, runDistance);
        count++;
    }
}
