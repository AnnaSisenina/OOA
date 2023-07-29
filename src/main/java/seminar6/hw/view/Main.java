package seminar6.hw.view;

import seminar6.hw.data.Calculation;
import seminar6.hw.data.History;
import seminar6.hw.controller.Controller;
import seminar6.hw.service.ComplexNumber;
import seminar6.hw.service.RationalNumber;
import seminar6.hw.service.RealNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Calculation> calcHistory = new ArrayList<>();
        History history = new History(calcHistory);
        Controller controller = new Controller(history);
        startPO(controller);
    }

    private static void startPO(Controller controller) {
        boolean exit = false;
        int answer;
        Scanner scanner = new Scanner(System.in);
        while (!exit) {
            programMenu();
            answer = scanner.nextInt();
            switch (answer) {
                case 1 -> numberTypeMenu(controller, scanner);
                case 2 -> controller.showHistory();
                case 3 -> exit = true;
                default -> {
                    System.out.println("Вы ввели некорректный ответ, попробуйте еще раз");
                    programMenu();
                }
            }
        }
    }

    private static void programMenu() {
        System.out.println(
                """
                        Главное меню\s
                        1. Открыть калькулятор\s
                        2. Показать историю вычислений\s
                        3. Выйти из программы\s
                        """
        );
    }

    private static void numberTypeMenu(Controller controller, Scanner scanner) {
        System.out.println("Выберите вид чисел " +
                "1. Вещественные " +
                "2. Рациональные " +
                "3. Комплексные  ");
        int type = scanner.nextInt();
        scanner.nextLine();
        switch (type) {
            case 1 -> calculationMenu(controller, scanner);
            case 2 -> calculationRatioMenu(controller, scanner);
            case 3 -> calculationComplexMenu(controller, scanner);
            default -> System.out.println("Вы ввели некорректный ответ, попробуйте еще раз");
        }
    }

    private static void calculationComplexMenu(Controller controller, Scanner scanner) {
        System.out.println("Выберите операцию: " +
                "1. Сложение " +
                "2. Умножение " +
                "3. Деление " +
                "4. Закрыть калькулятор ");
        int answer = scanner.nextInt();
        scanner.nextLine();
        switch (answer) {
            case 1:
                controller.sumComplex(inputComplexNumbers());
                break;
            case 2:
                controller.multiplyComplex(inputComplexNumbers());
                break;
            case 3:
                controller.divideComplex(inputComplexNumbers());
                break;
            case 4:
                break;
            default:
                System.out.println("Вы ввели некорректный ответ, попробуйте еще раз ");
                calculationComplexMenu(controller, scanner);
        }
    }

    private static List<ComplexNumber> inputComplexNumbers() {
        List<ComplexNumber> complexNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действительную часть первого числа: ");
        double validPart = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите мнимую часть первого числа: ");
        double imagePart = Double.parseDouble(scanner.nextLine());
        ComplexNumber firstComplexNumber = new ComplexNumber(validPart, imagePart);
        complexNumbers.add(firstComplexNumber);
        System.out.println("Введите действительную часть второго числа: ");
        validPart = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите мнимую часть второго числа: ");
        imagePart = Double.parseDouble(scanner.nextLine());
        ComplexNumber secondComplexNumber = new ComplexNumber(validPart, imagePart);
        complexNumbers.add(secondComplexNumber);
        return complexNumbers;
    }

    private static void calculationRatioMenu(Controller controller, Scanner scanner) {
        System.out.println("Выберите операцию: " +
                "1. Сложение " +
                "2. Умножение " +
                "3. Деление " +
                "4. Закрыть калькулятор ");
        int answer = scanner.nextInt();
        scanner.nextLine();
        switch (answer) {
            case 1:
                controller.sumRational(inputRatioNumbers());
                break;
            case 2:
                controller.multiplyRational(inputRatioNumbers());
                break;
            case 3:
                controller.divideRatio(inputRatioNumbers());
                break;
            case 4:
                break;
            default:
                System.out.println("Вы ввели некорректный ответ, попробуйте еще раз ");
                calculationRatioMenu(controller, scanner);
        }
    }

    private static List<RationalNumber> inputRatioNumbers() {
        List<RationalNumber> rationalNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целую часть первого числа: ");
        int integerPart = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите числитель первого числа: ");
        int numerator = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите знаменатель первого числа: ");
        int denominator = scanner.nextInt();
        scanner.nextLine();
        RationalNumber firstRationalNumber = new RationalNumber(integerPart, numerator, denominator);
        rationalNumbers.add(firstRationalNumber);
        System.out.println("Введите целую часть второго числа: ");
        integerPart = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите числитель второго числа: ");
        numerator = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите знаменатель второго числа: ");
        denominator = scanner.nextInt();
        scanner.nextLine();
        RationalNumber secondRationalNumber = new RationalNumber(integerPart, numerator, denominator);
        rationalNumbers.add(secondRationalNumber);
        return rationalNumbers;
    }

    private static void calculationMenu(Controller controller, Scanner scanner) {
        System.out.println("Выберите операцию: " +
                "1. Сложение " +
                "2. Умножение " +
                "3. Деление " +
                "4. Перевод в двоичное представление " +
                "5. Закрыть калькулятор ");

        int answer = scanner.nextInt();
        scanner.nextLine();
        switch (answer) {
            case 1:
                controller.sumReal(inputNumbers());
                break;
            case 2:
                controller.multiplyReal(inputNumbers());
                break;
            case 3:
                controller.divideReal(inputNumbers());
                break;
            case 4:
                System.out.println("Введите число: ");
                String number = scanner.nextLine();
                controller.binaryConversion(new RealNumber(Double.parseDouble(number)));
                break;
            case 5:
                break;
            default:
                System.out.println("Вы ввели некорректный ответ, попробуйте еще раз ");
                calculationMenu(controller, scanner);
        }
    }

    private static List<RealNumber> inputNumbers() {
        List<RealNumber> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double firstNumber = Double.parseDouble(scanner.nextLine());
        numbers.add(new RealNumber(firstNumber));
        System.out.println("Введите второе число: ");
        double secondNumber = Double.parseDouble(scanner.nextLine());
        numbers.add(new RealNumber(secondNumber));
        return numbers;
    }


}
