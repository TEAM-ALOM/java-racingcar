package controller;

import domain.RacingGame;
import view.OutputView;

public class RacingStadium {
    public void startRace(int playRound, RacingGame racingGame) {
        try {
            for (int i = 0; i < playRound; i++) {
                racingGame.moveCar();
                OutputView.printRoundResult(racingGame);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            startRace(playRound, racingGame);
        }
    }
}
