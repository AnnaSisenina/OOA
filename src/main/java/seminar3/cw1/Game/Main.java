package seminar3.cw1.Game;


import java.util.Scanner;

public class Main
{
    // todo: ввод пользователя
    // todo: логирование пользовательских попыток
    public static void main (String[] args)
    {
        System.out.println("Начать игру? " +
                "1. Да " +
                "2. Нет ");
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equals("1"))
        startTheGame();
    }

    private static void startTheGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбрать игру: " +
                "1. Игра с цифрами  " +
                "2. Игра с русскими буквами  " +
                "3. Игра с латинскими буквами  ");
        String gameType = scanner.nextLine();
        AbstractGame game = new NumberGame();
        switch (gameType) {
            case "1" -> game = new NumberGame();
            case "2" -> game = new RuGame();
            case "3" -> game = new EnGame();
            default -> {
                System.out.println("Вы ввели что-то не то, играем с цифрами");
            }
        }
        System.out.println("Введите длину слова:");
        int wordLength = scanner.nextInt();
        System.out.println("Введите количество попыток:");
        int tryCount = scanner.nextInt();
        scanner.nextLine();
        game.start(wordLength, tryCount);
        boolean isFinish = false;
        boolean isWin = false;
        while (!(isFinish || isWin ) && game.tryCount!=0) {
            Answer answer = game.inputValue(scanner.nextLine());
            if (answer != null) System.out.println("answer: " + answer);
            isFinish = game.getGameStatus() == GameStatus.FINISH;
            isWin = game.getGameStatus() == GameStatus.WIN;
        }
        if (isWin) System.out.println("Вы победили!");
        else System.out.println("Вы проиграли...");
        System.out.println("Показать лог игры: " +
                "1. Да "+
                "2. Нет ");
        if (scanner.nextLine().equals("1"))
        game.gameLog.printGameLog();
        System.out.println();
        System.out.println("Играть снова: " +
                "1. Да "+
                "2. Нет ");
        if (scanner.nextLine().equals("1"))
            startTheGame();

    }
}
