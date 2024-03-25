package racingcar.model;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void move() {
        Car car = new Car("June", 0);
        System.out.println(car.getPosition());
    }
}