package racingcar.model;

import java.util.List;
import java.util.Random;

public class WinningResult {
    public int winningScore = 0;

    public void winningScore(List<Car> cars) {
        for (int m = 0; m < cars.size(); m++) {
            if (winningScore < cars.get(m).getPosition()) {
                winningScore = cars.get(m).getPosition();
            }
        }
    }

}
