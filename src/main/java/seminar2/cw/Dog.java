package seminar2.cw;
/* Попрактикуемся на задаче:
        Создать классы Собака, Кот,Домашний Кот, Тигр, Животное
        Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина препятствия.
        У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м; плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет печать в консоль.
         Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
        Создать один массив с животными и заставить их по очереди пробежать дистанцию и проплыть.
         Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных. */

public class Dog extends Animal {
    static int count;
    int runDistance;
    int swimDistance;

    public Dog(String name, int runDistance, int swimDistance) {
        super(name);
        if (runDistance > 500) {
            this.runDistance = 500;
            System.out.println("Введенное значение больше максимального значения, установлено максимальное");
        } else this.runDistance = runDistance;
        if (swimDistance > 10) {
            this.swimDistance = 10;
            System.out.println("Введенное значение больше максимального значения, установлено максимальное");
        } else this.swimDistance = swimDistance;
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) {
            System.out.println(super.name + " Не сможет пробежать");
        } else {
            System.out.println(super.name + " Пробежал");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > swimDistance) {
            System.out.println(super.name + " Не сможет проплыть");
        } else {
            System.out.println(super.name + " Проплыл");
        }
    }
}
