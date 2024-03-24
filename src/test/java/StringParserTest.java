import domain.StringParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

public class StringParserTest {
    @DisplayName("콤마 분리 테스트")
    @Test
    void splitTest() {
        //StringParser stringParser = new StringParser();
        String testString = "orange,lemon,apple";

        List<String> result = StringParser.SplitByComma(testString);
        for (String item : result) {
            System.out.println(item);
        }
        assertThat(result).containsExactly("orange", "lemon", "apple");
    }

    @DisplayName("차 이름 길이 테스트")
    @Test
    void checkCarNameLength(){
        List<String> carList = Arrays.asList("Tico", "Kia", "Matiz", "Ren");
        //List<String> carList = Arrays.asList("Ticooo", "Kiaaaa", "Matiz", "Ren");

        //테스트 성공(5자 초과하는 이름이 없을 때), 테스트 실패(5자 초과하는 이름 존재 시)
        carList.forEach(carName ->
                assertTrue(carName.length() < 6, carName + "의 길이가 6자 이상.")
        );

        //추후 리스트를 받아와서 그걸로 테스트하게 변경
    }

}
