package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static racingcar.domain.Cars.getCarsByName;

public class CarsTest {
    @Test
    void CraeteCarList(){
        //given
        List<String> car_name = new ArrayList<>(){{ add("qewr"); add("asdf"); add("zxcv"); }};
        List<Car> result = new ArrayList<Car>(){{ add(new Car("qewr")); add(new Car("asdf")); add(new Car("zxcv")); }};
        List<Car> cars;
        //when
        cars = getCarsByName(car_name);
        //then
        cars.equals(result);
    }
}
