import controller.RacingGameController;

import java.io.IOException;

public class RacingMain {

    public static void main(String[] args) throws IOException {
        RacingGameController racingGameController = new RacingGameController();
        racingGameController.run();
    }
}
