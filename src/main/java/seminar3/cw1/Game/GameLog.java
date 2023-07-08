package seminar3.cw1.Game;

import java.util.List;

public class GameLog {
    String theWord;
    List<AttempLog> gameLog;

    public GameLog(List<AttempLog> gameLog){
        this.gameLog = gameLog;
    }
    public GameLog(String theWord, List<AttempLog> gameLog) {
        this.theWord = theWord;
        this.gameLog = gameLog;
    }
    public void printGameLog() {
        System.out.println("ЛОГ ИГРЫ: ");
        System.out.println("Загаданное слово: " + theWord);
        int i = 1;
        for (AttempLog attempLog : gameLog) {
            System.out.println("Попытка №" + i + ": ");
            System.out.println("Введенное слово: " + attempLog.userInput);
            System.out.println(attempLog.answer.toString());
            i++;
        }
        System.out.println();
    }
}
