package domain;


import org.kokodak.Randoms;
import view.ResultView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingGame {
    private final String carNames;
    private final int tryCount;
    String[] carList;
    Map<String, Integer> carMove;

    public RacingGame(String carNames, int tryCount) {
        this.carNames = carNames;
        this.carList = carNames.split(",");
        this.tryCount = tryCount;
    }

    public void race() {
        carMove = setCarMove(carList);
        for (int i = 0; i < tryCount; i++) {
            setRandomMove();
            ResultView.printCarMove(carMove, tryCount);
        }

    }

    private Map<String, Integer> setCarMove(String[] carList) {
        Map<String, Integer> carMove = new HashMap<>();
        for (String s : carList) {
            carMove.put(s, 0);
        }
        return carMove;
    }

    private void setRandomMove() {
        for (int i = 0; i < carList.length; i++) {
            int move = Randoms.pickNumberInRange(0, 9);
            if (move >= 4) {
                carMove.put(carList[i], carMove.get(carList[i]) + 1);
            }
        }
    }

    public List<String> getWinners() {

        List<String> winners;

        return winners;
    }
}
