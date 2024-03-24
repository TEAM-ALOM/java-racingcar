package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class CarTest {

    @DisplayName("0~3일 때는 움직이지 않음")
    @ParameterizedTest
    @CsvSource(value = {"0,0", "1,0", "2,0", "3,0"})    //생성했을 때의 distance의 INITIAL_VALUE = 0
    void 움직이지_않음(int number, int distance) {
        Car car = new Car("test");
        car.move(number);
        assertThat(car.getDistance()).isEqualTo(distance);
    }

    @DisplayName("4~9일 때는 움직임")
    @ParameterizedTest
    @CsvSource(value = {"4,1", "5,1", "6,1", "7,1", "8,1", "9,1"})    //생성했을 때의 distance의 INITIAL_VALUE = 0
    void 움직임(int number, int distance) {
        Car car = new Car("test");
        car.move(number);
        assertThat(car.getDistance()).isEqualTo(distance);
    }
}