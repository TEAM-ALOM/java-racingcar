import domain.Car;
import domain.Cars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.OutputView;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RacingTest {

    @DisplayName("레이싱 진행 테스트")  // 차 이름과 현재 포지션이 제대로 출력 되는지 확인
    @Test
    public void racingTest() {
        List<String> carNameList = Arrays.asList("Tico", "Kia", "Matiz", "Ren");
        Cars cars = new Cars(carNameList);

        List<Car> carList = cars.getCars();
        int count = 1;

        for (Car car : carList) {
            car.setPosition(count);
            count++;
        }

        OutputView outputView = new OutputView();
        outputView.printStatus(carList);
    }
    @Test
    @DisplayName("차 이동 성공 테스트")
    void moveCarTestSuccess(){
        Car car = new Car("superCar");
        car.setPosition(2);
        car.move(6);
        assertThat(car.getPosition()).isEqualTo(3);
    }
    @Test
    @DisplayName("차 이동 실패 테스트")
    void moveCarTestFalied(){
        Car car = new Car("superCar");
        car.setPosition(2);
        car.move(1);
        assertThat(car.getPosition()).isEqualTo(3);  //차가 이동하지 못해 에러 발생시키기
    }
}
