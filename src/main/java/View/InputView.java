package View;

import java.util.Scanner;

public class InputView {
    static String INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    static String  INPUT_GAME_TRY_NUMBER = "시도할 회수는 몇회인가요?";
    static Scanner scanner = new Scanner(System.in);
    public static String[] inputCarNames(){
        System.out.println(INPUT_CAR_NAMES);
        String[] carNames=scanner.nextLine().split(",");
        return carNames;
    }
    public static int inputGameTryNumber(){
        System.out.println(INPUT_GAME_TRY_NUMBER);
        int tryNumber = scanner.nextInt();
        return tryNumber;
    }
}
