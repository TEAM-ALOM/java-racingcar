package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

public class OutputView {
    public static void printResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + getProgression(car));
        }
        System.out.println();
    }

    public static void printFianlResult(List<Car> winners) {
        StringBuilder value = new StringBuilder(winners.get(0).getName());
        for (int i = 1; i < winners.size(); i++) {
            value.append(",").append(winners.get(i).getName());
        }
        System.out.println(value + "가 최종 우승했습니다.");
    }

    private static String getProgression(Car car) {
        return "-".repeat(Math.max(0, car.getProgressionDegree()));
    }
}
