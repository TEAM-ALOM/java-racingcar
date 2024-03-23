package racingcar.view;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String GETTING_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String GETTING_NUMBER_MESSAGE = "시도할 횟수는 몇회인가요?";
    private static final String INPUT_ERROR_MESSAGE = "[ERROR] 입력이 올바르지 않습니다.";

    public static List<String> getNames() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(GETTING_NAME_MESSAGE);
        try {
            return List.of(scanner.nextLine().split(","));
        } catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException(INPUT_ERROR_MESSAGE);
        }
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(GETTING_NUMBER_MESSAGE);
        try {
            return scanner.nextInt();
        } catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException(INPUT_ERROR_MESSAGE);
        }
    }
}