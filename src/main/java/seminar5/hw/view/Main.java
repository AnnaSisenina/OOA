package seminar5.hw.view;

import seminar5.hw.controller.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        System.out.println("Открыть калькулятор? " +
                "1. Да " +
                "2. Нет ");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        scanner.close();
        switch (answer) {
            case 1:
                calculationMenu();
                break;
            case 2:
                break;
            default:
                System.out.println("Вы ввели некорректный ответ, попробуйте еще раз");
                mainMenu();
        }

    }

    private static void calculationMenu() {
        System.out.println("Выберите операцию: " +
                "1. Сложение " +
                "2. Умножение " +
                "3. Деление " +
                "4. Перевод в двоичное представление " +
                "5. Закрыть калькулятор ");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        scanner.close();
        Controller controller = new Controller();
        switch (answer) {
            case 1:
                controller.sum(inputNumbers());
                break;
            case 2:
                controller.multipl(inputNumbers());
                break;
            case 3:
                controller.divide(inputNumbers());
                break;
            case 4:
                System.out.println("Введите число: ");
                Scanner scanner1 = new Scanner(System.in);
                String number = scanner1.nextLine();
                scanner1.close();
                controller.binaryConversion(number);
                break;
            case 5:
                break;
            default:
                System.out.println("Вы ввели некорректный ответ, попробуйте еще раз ");
                calculationMenu();
        }
    }

    private static List<Double> inputNumbers() {
        List<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        numbers.add(Double.parseDouble(scanner.nextLine()));
        System.out.println("Введите второе число: ");
        numbers.add(Double.parseDouble(scanner.nextLine()));
        scanner.close();
        return numbers;
    }


}
