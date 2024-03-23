package view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputViewTest {
    @ParameterizedTest
    @ValueSource(strings = {"helloo", "", "hello,hello", " "})//5자이상, 0자, 중복 이름, 공백 여부 확인 테스트
    @DisplayName("자동차 이름 적합도")
    void nameTest(String carname) {
        assertThrows(IllegalArgumentException.class, () -> InputView.makeCarList(carname));
    }


}

