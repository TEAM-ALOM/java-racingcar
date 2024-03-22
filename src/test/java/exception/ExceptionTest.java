package exception;

import controller.Controller;
import domain.CarGame;
import domain.car.RandomProgressCar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void 이름_예외_테스트() {
        String[] names = {"aaaa", "bbbbbb", "c"};
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CarGame carGame = new CarGame(names,new RandomProgressCar());
        });
    }
    @Test
    void 경주횟수_예외_테스트() {
        int tryNumber = -1;
        Controller controller = new Controller();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            controller.validateTryNumber(tryNumber);
        });

    }
}
