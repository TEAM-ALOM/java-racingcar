package racingcar.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void createCar() {
        //given
        String car_name = "myCar";
        //when
        Car car = new Car(car_name);
        String find_car_name = car.getName();
        //then
        find_car_name.equals(car_name);
    }

    @Test
    void checkCarProgression(){
        //given
        String car_name = "myCar";
        Car car = new Car(car_name);
        //when
        int car_progression = car.getProgressionDegree();
        //then
        Assertions.assertEquals(car_progression,0);

    }

    @Test
    void moveCar() {
        //given
        String car_name = "myCar";
        Car car = new Car(car_name);
        //when
        car.moveCar();
        int car_progression = car.getProgressionDegree();
        //then
        Assertions.assertEquals(car_progression,1);
    }
}