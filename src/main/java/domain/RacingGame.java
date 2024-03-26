package domain;


import org.kokodak.Randoms;
import view.ResultView;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingGame {
    private final String carNames;
    private final int tryCount;
    String[] carList;
    Map<String, Integer> moveCnt;

    public RacingGame(String carNames, int tryCount) {
        this.carNames = carNames;
        this.carList = carNames.split(",");
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

    private Map<String, Integer> setMoveCnt(String[] carList) {
        Map<String, Integer> moveCnt = new HashMap<>();
        for (String s : carList) {
            moveCnt.put(s, 0);
        }
        return moveCnt;
    }

    private void setRandomMove() {
        for (int i = 0; i < carList.length; i++) {
            int move = Randoms.pickNumberInRange(0, 9);
            if (move >= 4) {
                moveCnt.put(carList[i], moveCnt.get(carList[i]) + 1);
            }
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
