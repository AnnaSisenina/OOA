package seminar2.hw;
/*
Домашнее задание на закрепление :
1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса.
Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
списку он препятствий не идет.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 100, 10);
        Robot bender = new Robot("Bender", 200, 1);
        Human homer = new Human("Homer", 50, 3);

        Wall wall = new Wall("highWall", 2);
        Racetrack racetrack = new Racetrack("longRace", 60);

        List<Creature> members = new ArrayList<>();
        members.add(barsik);
        members.add(bender);
        members.add(homer);

        List<Let> lets = new ArrayList<>();
        lets.add(wall);
        lets.add(racetrack);

        for (Creature member : members) {
            System.out.println("Участник " + member.toString());
            for (Let let : lets) {
                System.out.println("Препятствие " + let.toString());
                if (!member.goThrough(let)) {
                    System.out.println(member.toString() + " сошел с дистанции");
                    break;
                }
            }
        }
    }
}
