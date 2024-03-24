package domain;

import utils.NumberGenerator;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private static final int DEFAULT_POSITION = 0;

    private final List<Car> cars;

    //생성자, 주어진 자동차 리스트를 이용하여 Cars 객체 생성
    public Cars(final List<Car> cars){
        //리스트 변경 불가능 하도록
        this.cars = Collections.unmodifiableList((cars));
    }

    //from 주어진 이름을 이용하여 새로운 자동차 객체를 생성
    public static Cars from(final List<String> carNames){
        List<Car> cars = carNames.stream()
                .map(Car::from)
                .collect(Collectors.toList());
        //map 은 스트림의 각 요소에 함수 적용, from 으로 각 이름으로부터 Car 객체를 생성
        //스트림화 했던 것을 다시 리스트화

        return new Cars(cars); //car 정보를 담은 Cars 새로운 객체
    }

    //각 자동차마다 무작위로 생성된 숫자에 따라 이동
    public void moveAll(final NumberGenerator numberGenerator){
        for (Car car : cars){ //cars 리스트에 있는 모든 자동차 객체데 대해 반복
            int number = numberGenerator.generate();
            car.move(number); //4이상이면 위치 증가
        }
    }


    private int getMaxPosition(){
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(DEFAULT_POSITION);
    }


    public Cars findWinners(){
        int maxPosition = getMaxPosition();
        List<Car> winningCars = cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
        return new Cars(winningCars);
    }

    public List<Car> getCars(){
        return cars;
    }
}