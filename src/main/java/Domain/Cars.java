package Domain;

import utils.NumberGenerator;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {   //자동차들의 정보 저장
    private static final int DEFAULT_POSITION = 0;   //초기 위치=0

    private final List<Car> cars;                   //자동차들의 정보를 저장할 리스트 선언

    public Cars(final List<Car> cars){
        this.cars = Collections.unmodifiableList(cars);
    }

    public static Cars InitialInform(final List<String> carNames){  //carNames의 각 요소를 Car객체로 변환하여 리스트에 저장
        List<Car> cars = carNames.stream()
                .map(Car::InitialInform)
                .collect(Collectors.toList());
        return new Cars(cars);
    }

    public void moveAll(final NumberGenerator numberGenerator){
        for(Car car : cars){
            int number = numberGenerator.generate();
            car.move(number);
        }
    }

    public Cars findWinners(){
        int maxPosition = getMaxPosition();
        List<Car> winningCars = cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
        return new Cars(winningCars);
    }

    private int getMaxPosition(){
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(DEFAULT_POSITION);
    }

    public List<Car> getCars(){
        return cars;
    }
}
