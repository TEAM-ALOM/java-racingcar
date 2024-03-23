package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RandCarPosTest {
    @Test
    @DisplayName("랜덤 숫자 범위 내 값 여부")
    void 랜덤(){
        RandCarPos rc = new RandCarPos();
        assertThat(rc.makeRandNum()).isLessThan(10).isGreaterThan(-1);
    }

}
