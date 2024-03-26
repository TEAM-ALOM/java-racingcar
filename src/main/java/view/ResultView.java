package view;

import java.util.List;
import java.util.Map;

public class ResultView {

    public static void printCarMove(Map<String, Integer> moveCnt) {
        for (String s : moveCnt.keySet()) {
            String bars = "-".repeat(moveCnt.get(s));
            System.out.println(s + " : " + bars);
        }
    }
    public static void printWinners(List<String> winners) {
        System.out.println();
        for (int i = 0; i < winners.size() - 1; i++) {
            System.out.print(winners.get(i) + ", ");
        }
        System.out.println(winners.get(winners.size() - 1) + "가 최종 우승했습니다.");
    }
}
