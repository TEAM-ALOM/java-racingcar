package domain;

import java.util.*;

public class RacingGame {
    private Map<String, Integer> cars;
    private int tryCount;

    public RacingGame(){

    }
    public RacingGame(Map<String, Integer> cars, int tryCount){
        this.cars = cars;
        this.tryCount = tryCount;
    }

    public void updateDistance(String carName){
        int distance = cars.get(carName) + 1;
        this.cars.replace(carName, distance);
    }

    public Map<String, Integer> getCars() {
        return cars;
    }

    public int getTryCount() {
        return tryCount;
    }
}
