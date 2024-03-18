package racingcar.domain;

import java.util.Random;

public class CarRacing {
    private final int CRITERIA = 4;
    public static void Racing(Car car){
        if(isMoving()){
            car.moveCar();
        }
    }

    private static boolean isMoving(){
        Random random = new Random();
        if(random.nextInt(10) >= 4){
            return true;
        }
        return false;
    }
}
