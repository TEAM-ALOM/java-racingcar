package domain;

import domain.car.Car;
import domain.car.RandomProgressCar;
import exception.Exception;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class CarGame {
    private List<Car> cars = new ArrayList<>();
    private final Car carStrategy;
    public CarGame(String []carNames,Car carStrategy){
        this.carStrategy = carStrategy;
        for (String carName : carNames) {
            Exception.validateNameLength(carName);
            Car newCar = carStrategy.returnCar(carName);
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
        Car winningCar = returnWinningCar();
        for (Car car : cars) {
            if(car.getProgress()==winningCar.getProgress())
                winningCars.add(car.getName());
            
        }
        return winningCars;
    }
    public Car returnWinningCar(){
        cars.sort(Comparator.comparingInt(Car::getProgress));
        int maxIndex = cars.size() - 1;
        return cars.get(maxIndex);
    }
}
