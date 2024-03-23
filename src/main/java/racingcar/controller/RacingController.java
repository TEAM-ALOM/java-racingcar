package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Winner;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

import static racingcar.domain.CarRacing.RacingCars;
import static racingcar.domain.Cars.getCarsByName;

public class RacingController {
    static List<String> names;
    static List<Car> cars;
    static int number;

    public static void startRacing() {
        names = InputView.getNames();
        number = InputView.getNumber();
        cars = getCarsByName(names);

        for (int i = 0; i < number; i++) {
            RacingCars(cars);
            OutputView.printResult(cars);
        }

        OutputView.printFianlResult(Winner.getWinners(cars));
    }


}