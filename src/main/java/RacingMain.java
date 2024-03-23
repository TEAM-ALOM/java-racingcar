import java.util.List;

import controller.RacingStadium;
import controller.ViewController;
import domain.Car;
import domain.RacingGame;
import domain.Winner;
import view.OutputView;

public class RacingMain {
    public static void main(String[] args) {
        runApplication();
    }

    private static void runApplication() {
        try {
            final String[] inputCarNames = ViewController.generateRacingCarNames();
            final List<Car> racingCars = RacingGame.generateCars(inputCarNames);
            final int GameRound = ViewController.generateGameRound();

            RacingGame racingGame = new RacingGame(racingCars);
            RacingStadium racingStadium = new RacingStadium();
            racingStadium.startRace(GameRound, racingGame);

            Winner winner = new Winner();
            final List<String> winners = winner.findWinners(racingCars);
            OutputView.printWinners(winners);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            runApplication();
        }
    }
}