package seminar2.hw;

public class Human implements Creature{
    String name;
    Integer distance;
    Integer height;


    public Human(String name, Integer distance, Integer height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public boolean jump(Integer height) {
        if (height > this.height) {
            System.out.println(name + " не перепрыгнул это препятствие");
            return false;
        }
        else System.out.println(name + " перепрыгнул это препятствие");
        return true;
    }

    @Override
    public boolean run(Integer distance) {
        if (distance > this.distance) {
            System.out.println(name + " не пробежал эту дистанцию");
            return false;
        }
        else System.out.println(name + " пробежал эту дистанцию");
        return true;
    }

    @Override
    public boolean goThrough(Let let) {
        if (let.height!=null) return jump(let.height);
        if (let.distance!=null) return run(let.distance);
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}
