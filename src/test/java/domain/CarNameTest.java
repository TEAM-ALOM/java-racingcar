package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThatCode;

public class CarNameTest {

    @DisplayName("이름이 없거나, 5글자를 초과하면 예외")
    @ParameterizedTest
    @CsvSource(value = {"'', 이름이 반드시 존재해야 합니다.",
            "asdfgh, 이름은 5글자 이하여야 합니다.",
            "aassddff, 이름은 5글자 이하여야 합니다."})
    void 이름_예외_발생(String carName, String errorMessage) {
        assertThatThrownBy(() -> new CarName(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(errorMessage);
    }

    @DisplayName("1~5글자 이름은 유효")
    @ParameterizedTest
    @CsvSource(value = {"asdf", "ff", "jklkj"})
    void 유효한_이름(String carName) {
        assertThatCode(() -> new CarName(carName))
                .doesNotThrowAnyException();
    }


//    @ParameterizedTest  //하나의 테스트 메소드로 여러 개의 파라미터에 대해서 테스트할 수 있다고 함
//    @ValueSource    //리터럴 값의 단일 배열을 지정할 수 있음
//    @CsvSource    //입력값에 따라 결과값이 다른 경우를 테스트 하려면 //CSV(Comma Separated Values)

//    assertThatThrownBy: 예외가 발생하는 것을 검증할 때 사용
//    assertThatCode: 예외가 발생하지 않는 것을 검증할 때 사용
}
