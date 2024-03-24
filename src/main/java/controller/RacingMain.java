package controller;

import view.InputView;
import view.OutputView;
import domain.RacingGame;

import java.io.IOException;

public class RacingMain {

    public static void main(String[] args) throws IOException {
        final var carNames = InputView.getCarNames();
        final var tryCount = InputView.getTryCount();

        final var racingGame = new RacingGame(carNames, tryCount);
        OutputView.printAnnouncement();
        racingGame.race();

        OutputView.printWinners(racingGame.getWinners());

    }
}
