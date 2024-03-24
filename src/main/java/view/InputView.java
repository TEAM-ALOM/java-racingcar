package view;

import domain.StringParser;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String REQUEST_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String REQEUST_ATTEMPT_NUMBER = "시도할 회수는 몇회인가요?";
    private static final String CAR_NAME_LENGTH_ERROR = "차 이름은 5자 이내여야 합니다.";
    private static final String CAR_NAME_BLANK_ERROR = "차 이름은 공백일 수 없습니다.";
    private Scanner scanner = new Scanner(System.in);

    public List<String> readCarName() {
        System.out.println(REQUEST_CAR_NAME);

        String name = scanner.nextLine();
        List<String> carNames = StringParser.SplitByComma(name);
        validateCarName(carNames);

        return carNames;
    }

    public int readCount() {
        System.out.println(REQEUST_ATTEMPT_NUMBER);
        int count = scanner.nextInt();

        return count;
    }

    private void validateCarName(List<String> carNames) {
        for (String carName : carNames) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException(carName + CAR_NAME_LENGTH_ERROR);
            }
            if (carName.length() < 1) {
                throw new IllegalArgumentException(carName + CAR_NAME_BLANK_ERROR);
            }
        }
    }

}
