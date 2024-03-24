package controller;

import view.Output;

import java.util.*;

public class RacingGame {

    public static int[] racingStart(String[] carNames, int tryNumbers) {
        int[] saveNumbers = new int[tryNumbers];

        for(int i = 0; i < tryNumbers; ++i) {
            saveNumbers = randomGo(saveNumbers, carNames.length);
            Output.racingResultO(carNames, saveNumbers);
        }

        return saveNumbers;
    }
    public static int[] randomGo(int[] saveNumbers, int len) {

        for(int i = 0; i < len; ++i) {
            saveNumbers[i] = RacingGame.saveResult(saveNumbers[i]);
        }

        return saveNumbers;
    }

    public static int random() {
        Random random = new Random();
        int number = random.nextInt(9);

        if (number >= 4) return 1;
        return -1;
    }

    public static int saveResult(int saveNumber) {
        int b = RacingGame.random();

        if(b == 1) {
            return ++saveNumber;
        }

        return saveNumber;
    }

    public static List<String> gameWinner(int[] saveNumbers, String[] carNames) {
        int max = 0, c = 0;
        String[] winner = new String[carNames.length];

        for (int saveNumber : saveNumbers) {
            max = Math.max(max, saveNumber);
        }
        for (int i = 0; i < carNames.length; i++) {
            winner[i] = RacingGame.gameWinnerName(max, saveNumbers[i], carNames[i]);
        }

        List<String> gamewinner = new ArrayList<>(Arrays.asList(winner));
        gamewinner.removeIf(Objects::isNull);

        return gamewinner;
    }

    public static String gameWinnerName(int max, int saveNumber, String carName) {
        if(max == saveNumber){
            return carName;
        }
        return null;
    }

}
