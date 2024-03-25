package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingGame {

    public List<Car> saveCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < carNames.length; i++) {
            String name = carNames[i];
            cars.add(new Car(name, 0));
        }
        return cars;
    }
    public void updatePhase(List<Car> cars) {
        Random random = new Random();
        for (int j = 0; j < cars.size(); j++) {
            int randomNum = random.nextInt(10);
            if (randomNum >= 4) {
                cars.get(j).setPosition(cars.get(j).getPosition() + 1);
            }
        }
    }
}