import domain.StringParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class RacingTest {
    @DisplayName("콤마 분리 테스트")
    @Test
    void splitTest(){
        //StringParser stringParser = new StringParser();
        String testString = "orange,lemon,apple";

        List<String> result = StringParser.SplitByComma(testString);
        for (String item : result) {
            System.out.println(item);
        }

        assertThat(result).containsExactly("orange", "lemon", "apple");
    }
}
