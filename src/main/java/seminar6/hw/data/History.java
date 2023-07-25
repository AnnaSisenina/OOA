package seminar6.hw.data;

import java.util.List;
//Реализован Dependency inversion principle
//Добавлен абстрактный класс HistoryElement, который является родителем класса Calculation.
// До этого класс History зависел от класса Calculation напрямую, теперь в классе History использован абстрактный класс.
public class History <T extends HistoryElement>{
    List<T> calcHistory;

    public History() {
    }
    public History(List<T> calcHistory) {
        this.calcHistory = calcHistory;
    }

    public void addToHistory(T t) {
        calcHistory.add(t);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("History:" + "\n");
        for (HistoryElement element : calcHistory) {
            sb.append(element.toString());
            sb.append(" ");
        }
        return sb.toString();
    }
}
