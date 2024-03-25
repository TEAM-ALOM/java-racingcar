import controller.RacingController;
import service.RaceService;
import view.InputView;
import view.OutputView;

public class RacingMain {

    public static void main(String[] args) {
        // TODO: MVC 패턴을 기반으로 자동차 경주 미션 구현해보기

        RaceService raceService = new RaceService(new InputView(),new OutputView());
        RacingController racingController = new RacingController(raceService);
        racingController.start();
    }
}
