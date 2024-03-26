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

    public Map<String, Integer> getCars() {
        return cars;
    }

    public int getTryCount() {
        return tryCount;
    }
}
