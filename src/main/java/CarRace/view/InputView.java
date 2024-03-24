package CarRace.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {

    private static final String RACE_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String RACE_COUNT = "시도할 회수는 몇회인가요?";
    private static final String SEPARATOR_VALUE = ",";

    public static List<String> getCarNames() { // 경주할 자동차 이름을 입력받는 메소드
        System.out.println(RACE_CAR_NAME);
        return Arrays.asList(Console.readLine().split(SEPARATOR_VALUE));
    }

    public static int getRaceCount() { // 시도할 회수를 입력받는 메소드
        System.out.println(RACE_COUNT);
        return Integer.parseInt(Console.readLine());
    }


}
