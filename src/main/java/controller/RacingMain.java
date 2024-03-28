package controller;

import view.InputView;
import view.ResultView;
import domain.RacingGame;

public class RacingMain {
    public static void main(final String... args) {
        final var carNames = InputView.getCarNames();
        final var tryCount = InputView.getTryCount();

        final var racingGame = new RacingGame(carNames, tryCount);
        System.out.print("\n실행 결과");
        racingGame.race();

        ResultView.printWinners(racingGame.getWinners());
    }
}
