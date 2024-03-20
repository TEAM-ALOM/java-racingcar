package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarGame {
    private List<Car> cars = new ArrayList<>();

    public void excuteRacingGame(){
        for (Car car : cars) {
            car.carProgress();
        }
    }
    public List<String> returnWinningCarNames(){
        List<String> winningCars = new ArrayList<>();
        Car winningCar = returnWinningCarProgrss();
        for (Car car : cars) {
            if(car.getProgress()==winningCar.getProgress())
                winningCars.add(car.getName());
            
        }
        return winningCars;
    }
    public Car returnWinningCarProgrss(){
        cars.sort(Comparator.comparingInt(Car::getProgress));
        return cars.get(0);
    }



}
