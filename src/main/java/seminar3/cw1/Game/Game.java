package seminar3.cw1.Game;
//)Интерфейс взаимодействий Game (должны быть описаны сигнатуры методов start, inputValue,getGameStatus)

public interface Game
{
    void start (int wordLength, int attempts);

    Answer inputValue (String input);

    GameStatus getGameStatus ();
}