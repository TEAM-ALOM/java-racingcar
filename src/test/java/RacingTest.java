import domain.Car;
import domain.Cars;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.OutputView;

import java.util.Arrays;
import java.util.List;

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
}
