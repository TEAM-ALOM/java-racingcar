//import controller.Controller;
//
//public class RacingMain {
//
//    public static void main(String[] args) {
//        // TODO: MVC 패턴을 기반으로 자동차 경주 미션 구현해보기
//        Controller race = new Controller();
//        race.run();
//    }
//}

import controller.Controller;
import view.InputView;
import view.ResultView;
import model.domain.RacingGame;

public class RacingMain {
    public static void main(final String... args) {
//        final var carNames = InputView.inputCarName();
//        final var tryCount = InputView.inputTryNum();
//
//        final var racingGame = new RacingGame(carNames);
        final var controller = new Controller();
        controller.run();

    }
}