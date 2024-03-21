package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarGame {
    private List<Car> cars = new ArrayList<>();
    public CarGame(String []carNames){
        for (String carName : carNames) {
            Car newCar = new Car(carName);
            cars.add(newCar);
        }

    }

    public List<Car> getCars() {
        return cars;
    }

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
        int maxIndex = cars.size() - 1;
        return cars.get(maxIndex);
    }



}
