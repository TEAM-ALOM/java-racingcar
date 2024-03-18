package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

public class OutputView {
    public static void printResult(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).getName() + " : " + getProgression(cars.get(i)));
        }
        System.out.println("");
    }

    public static void printFianlResult(List<Car> winners) {
        String value = winners.get(0).getName();
        for (int i = 1; i < winners.size(); i++) {
            value += "," + winners.get(i).getName();
        }
        System.out.println(value + "가 최종 우승했습니다.");
    }

    private static String getProgression(Car car) {
        String progression = "";
        for (int j = 0; j < car.getProgressionDegree(); j++) {
            progression += "-";
        }

        return progression;
    }
}
