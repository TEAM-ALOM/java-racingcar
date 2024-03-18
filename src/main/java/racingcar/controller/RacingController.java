package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Winner;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

import static racingcar.domain.CarRacing.Racing;

public class RacingController {
    private static List<String> names;
    private static int number;
    private static List<Car> cars;

    public static void startRacing() {
        names = InputView.getNames();
        number = InputView.getNumber();
        cars = getCarsByName(names);

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < cars.size(); j++)
                Racing(cars.get(j));
            OutputView.printResult(cars);
        }

        OutputView.printFianlResult(Winner.getWinners(cars));
    }

    private static List<Car> getCarsByName(List<String> names) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            cars.add(new Car(names.get(i)));
        }

        return cars;
    }
}