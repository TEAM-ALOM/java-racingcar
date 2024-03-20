package controller;

import domain.RacingGame;
import view.OutputView;

public class RacingStart {
    public static void startRace(int playRound, RacingGame racingGame) {
        try {
            OutputView.printRoundResult(racingGame);
            for (int i = 0; i < playRound; i++) {
                RacingGame.moveCar();
                OutputView.printRoundResult(racingGame);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            startRace(playRound, racingGame);
        }
    }
}
