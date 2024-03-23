package exception;

import controller.Controller;
import domain.CarGame;
import domain.car.RandomProgressCar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void 이름길이_초과_예외_테스트() {
        String[] names = {"aaaa", "bbbbbb", "c"};
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CarGame carGame = new CarGame(names,new RandomProgressCar());
        });
    }
    @Test
    void 이름길이_미만_예외_테스트() {
        String[] names = {"aaaa", "", "c"};
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CarGame carGame = new CarGame(names,new RandomProgressCar());
        });
    }
    @Test
    void 경주횟수_예외_테스트() {
        int tryNumber = -1;
        Controller controller = new Controller();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Exception.validateTryNumber(tryNumber);
        });

    }
}
