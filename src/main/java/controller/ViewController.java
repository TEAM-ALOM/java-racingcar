package controller;

import domain.GameRound;
import utils.StringUtils;
import view.InputView;

public class ViewController {
    public static String[] generateRacingCarNames() {
        try {
            String input = InputView.inputCarNames();
            return StringUtils.splitInputName(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return generateRacingCarNames();
        }
    }

    public static int generateGameRound() {
        try {
            GameRound gameRound = new GameRound(InputView.inputGameRound());
            return gameRound.getGameRound();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return generateGameRound();
        }
    }
}
