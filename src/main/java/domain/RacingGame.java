package domain;


import org.kokodak.Randoms;
import view.ExceptionMessage;
import view.ResultView;

import java.util.*;

public class RacingGame {
    private final int tryCount;
    List<String> carList;
    public Map<String, Integer> moveCnt;

    public RacingGame(List<String> carNames, int tryCount) {
        this.carList = carNames;
        this.tryCount = tryCount;
    }

    public void race() {
        moveCnt = setMoveCnt(carList);
        for (int i = 0; i < tryCount; i++) {
            System.out.println();
            setRandomMove();
            ResultView.printCarMove(moveCnt);
        }

    }

    private Map<String, Integer> setMoveCnt(List<String> carList) {
        Map<String, Integer> moveCnt = new HashMap<>();
        for (String s : carList) {
            moveCnt.put(s, 0);
        }
        return moveCnt;
    }

    private void setRandomMove() {
        for (int i = 0; i < carList.size(); i++) {
            int move = Randoms.pickNumberInRange(0, 9);
            canMove(move, i);
        }
    }

    private void canMove(int move, int i) {
        if (move >= 4) {
            moveCnt.put(carList.get(i), moveCnt.get(carList.get(i)) + 1);
        }
    }

    public List<String> getWinners() {
        System.out.println();
        for (String s : moveCnt.keySet()) {
            String bars = "-".repeat(moveCnt.get(s));
            System.out.println(s + " : " + bars);
        }
        return findWinners(moveCnt);
    }

    private List<String> findWinners(Map<String, Integer> moveCnt) {
        int max = Collections.max(moveCnt.values());
        return moveCnt.entrySet().stream()
                .filter(m -> m.getValue() == max)
                .map(Map.Entry::getKey)
                .toList();
    }
}
