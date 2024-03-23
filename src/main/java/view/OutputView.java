package view;

import domain.Car;
import domain.Cars;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {

    private static final String RESULT_MESSAGE = "실행 결과";
    private static final String STATUS_FORMAT = "%s : %s\n";
    private static final String WINNER_FORMAT = "%s가 최종 우승했습니다.";
    private static final String HYPHEN = "-";

    public void printResult() {
        System.out.println(RESULT_MESSAGE);
    }

    public void printStatus(List<Car> cars) {
        for (Car car : cars) {
            String currentDistance = getCurrentDistance(car.getDistance());
            System.out.printf(STATUS_FORMAT, car.getCarName(), currentDistance);
        }
        System.out.println();
    }

    public void printWinners(List<Car> cars) {
        List<String> carNames = cars.stream()
                .map(Car::getCarName)
                .toList();
        String winners = String.join(",", carNames);
        System.out.printf(WINNER_FORMAT, winners);
    }

    private String getCurrentDistance(int distance) {
        return HYPHEN.repeat(distance);
    }
}
