package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WinnerTest {
    @Test
    void GetWinnerTest_ALlDiff() {
        //given
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        List<Car> winner;
        List<Car> result = new ArrayList<>(){{ add(car2); }};

        car1.moveCar();
        car1.moveCar();
        car2.moveCar();
        car2.moveCar();
        car2.moveCar();
        car3.moveCar();
        List<Car> cars = new ArrayList<>(){{add(car1); add(car2); add(car3); }};

        //when
        winner = Winner.getWinners(cars);

        //then
        winner.equals(result);
    }

    @Test
    void GetWinner_co_winner(){
        //given
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        List<Car> winner;
        List<Car> result = new ArrayList<>(){{ add(car2); add(car3); }};

        car1.moveCar();
        car1.moveCar();
        car2.moveCar();
        car2.moveCar();
        car2.moveCar();
        car3.moveCar();
        car3.moveCar();
        car3.moveCar();
        List<Car> cars = new ArrayList<>(){{ add(car1); add(car2); add(car3); }};

        //when
        winner = Winner.getWinners(cars);

        //then
        winner.equals(result);
    }
}
