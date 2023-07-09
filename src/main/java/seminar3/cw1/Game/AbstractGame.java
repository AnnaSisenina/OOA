package seminar3.cw1.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game
{
    protected int wordLength;

    protected int tryCount;

    protected String word;

    protected GameStatus status = GameStatus.INIT;
    GameLog gameLog = new GameLog(new ArrayList<>());

    public AbstractGame ()
    {

    }

    public AbstractGame (int wordLength, int tryCount, String word, GameStatus status)
    {
        this.wordLength = wordLength;
        this.tryCount = tryCount;
        this.word = word;
        this.status = status;
    }

    @Override
    public void start (int wordLength, int attempts)
    {
        status = GameStatus.START;
        this.wordLength = wordLength;
        this.tryCount = attempts;
        word = generateWord ();
        System.out.println ("word = " + word);
    }

    private String generateWord ()
    {
        List <String> strList = generateCharList ();
        Random random = new Random ();
        StringBuilder sb = new StringBuilder ();
        for (int i = 0; i < wordLength; i++)
        {
            int idx = random.nextInt (strList.size ());
            sb.append (strList.get (idx));
            strList.remove (idx);
        }
        gameLog.theWord = sb.toString();
        return sb.toString ();
    }

    public abstract List <String> generateCharList ();

    @Override
    public Answer inputValue (String input)
    {
        if (tryCount == 0)
        {
            status = GameStatus.FINISH;
            return null;
        }

        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < input.length (); i++)
        {
            if (input.charAt (i) == word.charAt (i)) bulls++;
            if (word.contains (String.valueOf (input.charAt (i)))) cows++;
        }

        if (bulls == wordLength) status = GameStatus.WIN;

        tryCount--;
        Answer answer = new Answer(bulls, cows);
        AttempLog attempLog = new AttempLog(answer, input);
        gameLog.gameLog.add(attempLog);
        return answer;
    }


    @Override
    public GameStatus getGameStatus ()
    {
        return status;
    }


}
