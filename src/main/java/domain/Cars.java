package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cars {

    private static final String DUPLICATED_NAMES_MASSAGE= "자동차의 이름은 중복될 수 없습니다.";
    private static final int DEFAULT_DISTANCE = 0;
    private final List<Car> cars;

    public Cars(List<String> carNames) {
        final List<Car> cars= generateCars(carNames);
        validateDuplication(carNames);
        this.cars = cars;
    }

    private List<Car> generateCars(List<String> cars) {
        return cars.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

//    이름 중복 확인
    private void validateDuplication(List<String> carNames) {
        Set<String> duplicationCheck = new HashSet<>(carNames);
        if (carNames.size() != duplicationCheck.size()) {
            throw new IllegalArgumentException(DUPLICATED_NAMES_MASSAGE);
        }
    }

//    최대 이동 거리 구하기
    private int findMaxDistance() {
        return cars.stream()
                .mapToInt(Car::getDistance)
                .max()
                .orElse(DEFAULT_DISTANCE);
    }

//    최대 이동 거리와 같은 위치에 있는 자동차들 찾기
    public List<Car> findWinner() {
        int maxDistance = findMaxDistance();
        return cars.stream()
                .filter(car -> car.getDistance() == maxDistance)
                .collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return cars;
    }
}
