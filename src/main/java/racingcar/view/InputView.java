package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.validator.InputValidator;

import static racingcar.constant.ViewMessage.INPUT_CAR_NAME_MESSAGE;
import static racingcar.constant.ViewMessage.INPUT_ROUND_MESSAGE;

public class InputView {
    public static String inputCarNames() {
        System.out.println(INPUT_CAR_NAME_MESSAGE.getMessage());
        String input = Console.readLine();

        InputValidator.validateInputCarName(input);

        return input;
    }

    public static String inputRound() {
        System.out.println(INPUT_ROUND_MESSAGE.getMessage());
        return Console.readLine();
    }
}
