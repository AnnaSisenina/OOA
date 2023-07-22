package seminar5.hw.data;

import java.util.List;

public class History {
    List<Calculation> calcHistory;

    public History() {
    }

    public History(List<Calculation> calcHistory) {
        this.calcHistory = calcHistory;
    }

    public void addToHistory(Calculation calculation) {
        calcHistory.add(calculation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("History:" + "\n");
        for (Calculation calculation : calcHistory) {
            sb.append(calculation.toString());
            sb.append(" ");
        }
        return sb.toString();
    }
}
