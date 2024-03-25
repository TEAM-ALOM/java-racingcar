import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kokodak.test.NsTest;
import static org.kokodak.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

public class racingcar {
    static class RacingMainTest extends NsTest {


        @Test
        void 기능테스트(){
            assertRandomNumberInRangeTest();
        }
        @Override
        public void runMain() {
            RacingMain.main(new String[]{});
        }
    }
}
