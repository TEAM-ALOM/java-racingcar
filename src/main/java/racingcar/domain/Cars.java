package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static racingcar.constant.ErrorMessage.CAR_NAME_INPUT_DUPLICATE_ERROR;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars of(List<String> carNames) {
        validate(carNames);
        
        List<Car> cars = carNames.stream()
                .map(Car::of)
                .collect(Collectors.toList());

        return new Cars(cars);
    }

    private static void validate(List<String> carNames) {
        Set<String> target = new HashSet<>(carNames);

        if (carNames.size() != target.size()) {
            throw new IllegalArgumentException(CAR_NAME_INPUT_DUPLICATE_ERROR.getErrorMessage());
        }
    }

    public void moveAll() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<String> getWinnerCars() {
        Car maxCar = getMaxPosition();

        return cars.stream()
                .filter(car -> car.equalsPosition(maxCar))
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private Car getMaxPosition() {
        return cars.stream()
                .max(Car::compareTo)
                .get();
    }

    public List<String> getMessages() {
        return cars.stream()
                .map(Car::toString)
                .collect(Collectors.toList());
    }
}
