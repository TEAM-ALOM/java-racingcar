
import java.util.Scanner;
import controller.RacingGameController;
import view.InputParser;
import view.InputValidator;
import view.InputView;
import view.OutputView;

public class RacingGameApplication {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RacingGameController racingGameController = new RacingGameController(inputView(), outputView());
        racingGameController.run();
        clean();
    }

    private static InputView inputView() {
        return new InputView(inputValidator(), inputParser(), scanner);
    }

    private static InputValidator inputValidator() {
        return new InputValidator();
    }

    private static InputParser inputParser() {
        return new InputParser();
    }

    private static OutputView outputView() {
        return new OutputView();
    }

    private static void clean() {
        scanner.close();
    }
}