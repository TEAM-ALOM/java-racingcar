package view;

import utils.Parser;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String READ_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String READ_TRY_COUNT_MESSAGE = "시도할 횟수는 몇회인가요?";

    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<String> readCarNames() {
        System.out.println(READ_CAR_NAMES_MESSAGE);
        String input = scanner.nextLine();
        return Parser.parseNames(input);
    }

    public int readTryCount() {
        System.out.println(READ_TRY_COUNT_MESSAGE);
        String input = scanner.nextLine();
        return Parser.parseCount(input);
    }
}
