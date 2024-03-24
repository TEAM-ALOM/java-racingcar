package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ParserTest {

    @DisplayName("쉼표를 기준으로 이름 분리")
//    @ParameterizedTest
//    @CsvSource(value = {"aa,bb,cc", "aaa, bbb,ccc ", "a,,b,c"})
    @Test
    void 이름_분리() {
        String string = "aa,bb,cc";
        List<String> names = Parser.parseNames(string);
        assertThat(names).containsExactly("aa", "bb", "cc");
    }

    @DisplayName("쉼표가 연속으로 오면 빈 문자열로 처리")
    @Test
    void 쉼표_연속() {
        String string = "a,,b,c";
        List<String> names = Parser.parseNames(string);
        assertThat(names).containsExactly("a", "", "b", "c");
    }
}