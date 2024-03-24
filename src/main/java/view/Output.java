package view;

import java.util.List;

public class Output {

    public static void carNameO() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void carNameError() {
        System.out.println("경주할 자동차 이름은 5글자 이하만 가능합니다.");
    }

    public static void tryNumbersO() {
        System.out.println("시도할 횟수는 몇회인가요?");
    }

    public static void tryNumbersError() {
        System.out.println("시도할 횟수는 0번 이상만 가능합니다.");
    }

    public static void saveResultO(int go) {
        for(int i = 0; i < go; ++i) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void racingResultO(String[] carNames, int[] saveNumbers) {
        int i = 0;
        for(String str : carNames) {
            System.out.print(str + " : ");
            saveResultO(saveNumbers[i++]);
        }
        System.out.println();
    }

    public static void racingWinner(List<String> gamewinner) {
        for(int i = 1; i < gamewinner.size(); i += 2) {
            gamewinner.add(i, ", ");
        }
        for(int i = 0; i < gamewinner.size(); ++i) {
            System.out.print(gamewinner.get(i));
        }
        System.out.println("가 최종 우승했습니다.");
    }


}
