package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarGame {
    private List<Car> cars = new ArrayList<>();
    public CarGame(String []carNames){
        for (String carName : carNames) {
            validateNameLengthMax(carName);
            Car newCar = new Car(carName);
            cars.add(newCar);
        }

    }

    public List<Car> getCars() {
        return cars;
    }

    public void excuteRacingGame(){
        for (Car car : cars) {
            car.excuteProgressOrStopCar();
        }
    }
    public List<String> returnWinningCarNames(){
        List<String> winningCars = new ArrayList<>();
        Car winningCar = returnWinningCarProgress();
        for (Car car : cars) {
            if(car.getProgress()==winningCar.getProgress())
                winningCars.add(car.getName());
            
        }
        return winningCars;
    }
    public Car returnWinningCarProgress(){
        cars.sort(Comparator.comparingInt(Car::getProgress));
        int maxIndex = cars.size() - 1;
        return cars.get(maxIndex);
    }
    public void  validateNameLengthMax(String name) {
        if(name.length()>5){
            throw new IllegalArgumentException("이 자동차 이름은 5자를 초과합니다.");

        }
    }



}
