package seminar1.cw.task1;
public class Cat extends Animal {
    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public Cat(String name) {
        super(name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }

    @Override
    public void voice() {
        System.out.println(" мявк - мявк");
    }
}

