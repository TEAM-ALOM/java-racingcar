package domain;

import java.util.*;

public class RacingGame {
    private static Map<String, Integer> cars;
    private int tryCount;

    public RacingGame(){

    }
    public RacingGame(Map<String, Integer> cars, int tryCount){
        this.cars = cars;
        this.tryCount = tryCount;
    }

    public static void updateDistance(String carName, int random){
        if(random >= 4) {
            int distance = cars.get(carName) + 1;
            cars.replace(carName, distance);
        }
    }

    public Map<String, Integer> getCars() {
        return cars;
    }

    public int getTryCount() {
        return tryCount;
    }
}
