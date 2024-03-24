package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class DistanceTest {

    @DisplayName("increase는 distance를 1 증가시킴")
    @ParameterizedTest
    @CsvSource(value = {"1"})
    void 이동거리_증가(int afterValue) {
        Distance distance = new Distance(); //애초에 기본 세팅이 0
        distance.increaseDistance();
        assertThat(distance.getDistance()).isEqualTo(afterValue);
    }
}