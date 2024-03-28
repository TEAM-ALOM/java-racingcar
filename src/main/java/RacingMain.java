import controller.RaceController;
import domain.RacingGame;

public class RacingMain {

    public static void main(String[] args) {
 /*       final var carNames = InputView.getCarNames();
        final var tryCount = InputView.getTryCount();

        final var racingGame = new RacingGame(carNames, tryCount);
        racingGame.race();

        ResultView.printWinners(racingGame.getWinners());
    }

    public static void getCarNames(){


    }

    public static void getTryCount(){};*/
        RaceController rc = new RaceController();
        rc.run();
}}
