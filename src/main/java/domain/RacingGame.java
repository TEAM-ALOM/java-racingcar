package domain;

import view.InputView;
import view.OutputView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingGame {
    private static List<Car> racingCars;

    public RacingGame(List<Car> racingCars) {
        // 검증 로직 구현
        this.racingCars = racingCars;
    }

    public List<Car> getRacingCars() {
        return racingCars;
    }

    public static void moveCar() {
        racingCars.forEach(car -> car.move(RandomNumber.generateRandomIntIntRange()));
    }

    public static List<Car> generateCars(String carNames) throws IOException {
        final List<Car> racingCars = new ArrayList<>();
        final String[] Cars;
        Cars = carNames.split(",");

        for (int i = 0; i < Cars.length; i++) {
            racingCars.add(new Car(Cars[i]));
        }

        return racingCars;
    }
}
