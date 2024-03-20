import controller.RacingStart;
import domain.Car;
import domain.RacingGame;
import domain.Winner;
import view.InputView;
import view.OutputView;

import java.io.IOException;
import java.util.List;

public class RacingMain {
    public static void main(String[] args) throws IOException {
        // TODO: MVC 패턴을 기반으로 자동차 경주 미션 구현해보기
        run();
    }

    private static void run() throws IOException {
        final String CARNAMES = InputView.getCarNames();
        final List<Car> racingCars = RacingGame.generateCars(CARNAMES);
        final int CNT = InputView.getTryCount();

        RacingGame racingGame = new RacingGame(racingCars);
        RacingStart.startRace(CNT, racingGame);

        Winner winner = new Winner();
        final List<String> winners = winner.findWinners(racingCars);
        OutputView.printWinners(winners);
    }
}