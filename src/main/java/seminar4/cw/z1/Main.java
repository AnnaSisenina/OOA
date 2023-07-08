package seminar4.cw.z1;

public class Main {
    public static void main(String[] args) {
        //1)Создать класс - коробку (SimpleBox), которая может хранить любые объекты.
        // Посмотреть с какими ошибками можно столкнуться и исправить данное решение на более подходящее(GenBox).
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj(); // каждый раз необходимо делать каст
        System.out.println("sum = " + sum);
        // разрастается....
        intBox2.setObj("10"); // засетить могут что и где угодно
        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {// каждый раз необходимо проверять каст
            // + если объектов много if  разрастётся
            int sum2 = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
            System.out.println("sum2 = " + sum2);
        }
        GenBox<Integer> gen1 = new GenBox(15);// за счёт предопределения - каст не нужен
        GenBox<Integer> gen2 = new GenBox(10);
        int sum3 = gen1.getObj() + gen2.getObj();
        System.out.println("sum3 = " + sum3);
        // разрастается....
//        gen1.setObj("10"); // ошибка теперь на стадии компиляции а не выполнения -> instanceof - не нужен

    }
}
