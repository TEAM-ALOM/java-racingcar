package racingcar.domain;

import java.util.List;
import java.util.Random;

public class CarRacing {
    private static final int CRITERIA = 4;

    public static void RacingCars(List<Car> cars){
        for (Car car : cars) Racing(car);
    }

    public static void Racing(Car car){
        if(isMoving())
            car.moveCar();
    }

    private static boolean isMoving(){
        return new Random().nextInt(10) >= CRITERIA;
    }
}