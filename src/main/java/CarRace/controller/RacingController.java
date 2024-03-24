package CarRace.controller;

import CarRace.domain.RacingGame;
import CarRace.view.InputView;
import CarRace.view.ResultView;

import java.util.List;

public class RacingController {

    public void startRace() {
        List<String> carNames = InputView.getCarNames();
        int tryCount = InputView.getRaceCount(); // InputView를 통해 차의 이름과 시도 회수를 입력받음

        RacingGame racingGame = new RacingGame(carNames, tryCount); // 입력받은 차의 이름과 시도 회수를 바탕으로 RacingGame 객체 생성
        racingGame.play(); // 레이스 시작

        ResultView.printWinners(racingGame.getWinners()); // 우승자 출력
    }
}
