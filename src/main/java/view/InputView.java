package view;

import org.kokodak.Console;

public class InputView {

    public static String getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return Console.readLine();
    }

    public static int getTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String str = Console.readLine();
        return Integer.parseInt(str);
    }
}
