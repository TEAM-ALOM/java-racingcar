package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.RacingGame;
import racingcar.model.WinningResult;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController {
    private final RacingGame racinggame = new RacingGame();
    private final WinningResult winningresult = new WinningResult();
    private final InputView inputView = new InputView();
    private final OutputView outputview = new OutputView();

    public void start() {
        String[] names = inputView.getNames();
        int round = inputView.getRound();
        List<Car> cars = racinggame.saveCars(names);
        roundResult(round, cars);
        winningresult.winningScore(cars);
        outputview.result(cars, winningresult.winningScore);
    }

    private void roundResult(int round, List<Car> cars) {
        System.out.println("");
        for (int i = 0; i < round; i++) {
            racinggame.updatePhase(cars);
            outputview.round(cars);
        }
    }
}
