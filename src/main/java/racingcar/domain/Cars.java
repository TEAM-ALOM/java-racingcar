package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static List<Car> getCarsByName(List<String> names) {
        List<Car> cars = new ArrayList<>();
        for (String name : names)
            cars.add(new Car(name));

        return cars;
    }
}
