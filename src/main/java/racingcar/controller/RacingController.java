package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Winner;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

import static racingcar.domain.CarRacing.Racing;

public class RacingController {

    public static void startRacing() {
        List<String> names = InputView.getNames();
        int number = InputView.getNumber();
        List<Car> cars = getCarsByName(names);

        for (int i = 0; i < number; i++) {
            for (Car car : cars) Racing(car);
            OutputView.printResult(cars);
        }

        OutputView.printFianlResult(Winner.getWinners(cars));
    }

    private static List<Car> getCarsByName(List<String> names) {
        List<Car> cars = new ArrayList<>();
        for (String name : names)
            cars.add(new Car(name));

        return cars;
    }
}