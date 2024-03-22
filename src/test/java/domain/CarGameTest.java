package domain;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


class CarGameTest {

    @Test
    void 이름_예외_테스트() {
        String[] names = {"aaaa", "bbbbbb", "c"};
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CarGame carGame = new CarGame(names);
        });
        //Random random = new Random(1234);
    }
    @Test
    void 자동차_이동(){

    }
}