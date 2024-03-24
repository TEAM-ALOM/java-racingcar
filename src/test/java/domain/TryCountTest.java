package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class TryCountTest {

    @DisplayName("시도 횟수가 0이거나 음수이면 예외")
    @ParameterizedTest
    @CsvSource(value = {"-1", "-12", "0"})
    void 양의_정수가_아님(int tryCount) {
        assertThatThrownBy(() -> new TryCount(tryCount))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("시도 횟수는 양의 정수여야 합니다");
    }

    @DisplayName("시도 횟수가 양수이면 유효")
    @ParameterizedTest
    @CsvSource(value = {"1", "5", "48"})
    void 유효한_시도_횟수(int tryCount) {
        assertThatCode(() -> new TryCount(tryCount))
                .doesNotThrowAnyException();
    }

    @DisplayName("decrease는 시도 횟수를 1 감소시킴")
    @ParameterizedTest
    @CsvSource(value = {"1, 0", "5, 4", "48, 47"})
    void 시도_횟수_감소_확인(int beforeValue, int afterValue) {
        TryCount tryCount = new TryCount(beforeValue);
        tryCount.decrease();
        assertThat(tryCount.getTryCount()).isEqualTo(afterValue);
    }

    @DisplayName("isRemain은 시도 횟수가 남았는지 확인함")
    @ParameterizedTest
    @CsvSource(value = {"1, false", "5, true"})
    void 시도_횟수_남았는지_확인(int beforeValue, boolean isRemain) {
        TryCount tryCount = new TryCount(beforeValue);
        tryCount.decrease();
        assertThat(tryCount.isRemain()).isEqualTo(isRemain);
    }
}