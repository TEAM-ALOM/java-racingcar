package domain;

import utils.NumberGenerator;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private static final int DEFAULT_POSITION = 0; //기존 시작위치
    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = Collections.unmodifiableList(cars); //리스트 이름불변
    }

    //from메서드: 문자열을 Car객체로 변환하는 정적 메서드
    public static Cars from(final List<String> carNames) { //
        List<Car> cars = carNames.stream() //cars리스트를 stream으로
                .map(Car::from) //문자열을 Car객체로 변환 --> 모은 리스트 생성
                .collect(Collectors.toList()); //스트림 --> 리스트
        return new Cars(cars);
    }

    public void moveAll(final NumberGenerator numberGenerator) {
        for (Car car : cars) {
            int number = numberGenerator.generate();
            car.move(number);
        }
    }

    public Cars findWinners() {
        int maxPosition = getMaxPosition();
        List<Car> winningCars = cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
        return new Cars(winningCars);
    }

    private int getMaxPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(DEFAULT_POSITION);
    }

    public List<Car> getCars() {
        return cars;
    }
}