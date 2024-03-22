package domain;

import View.InputView;
import controller.Controller;
import domain.car.Car;
import domain.car.FixProgressCar;
import domain.car.RandomProgressCar;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class CarGameTest {
    @Test
    void 자동차_이동_테스트(){
        //given
        String[] names = {"aaa"};// 이름의 글자가 3보다 작거나 같으면 이동,크면 정지로 설정.
        //when
        CarGame carGame = new CarGame(names, new FixProgressCar());
        carGame.excuteRacingGame();
        //then
        assertThat(
                carGame.getCars().get(0).getProgress()).isEqualTo(1);
    }
    @Test
    void 자동차_정지_테스트(){
        //given
        String[] names = {"aaaa"};// 이름의 글자가 3보다 작거나 같으면 이동,크면 정지로 설정.
        //when
        CarGame carGame = new CarGame(names, new FixProgressCar());
        carGame.excuteRacingGame();
        //then
        assertThat(
                carGame.getCars().get(0).getProgress()).isEqualTo(0);
    }

    @Test
    void 이긴_자동차_이름_반환_테스트(){
        //given
        String[] names = {"aaaa","bbb","cccc"};// 이름의 글자가 3보다 작거나 같으면 이동,크면 정지로 설정.
        //when
        CarGame carGame = new CarGame(names, new FixProgressCar());
        carGame.excuteRacingGame();
        //then
        assertThat(carGame.returnWinningCarNames().get(0)).isEqualTo("bbb");
    }
    @Test
    void 이긴_자동차_객체_반환_테스트(){
        //given
        String[] names = {"aaaa","bbb","cccc"};// 이름의 글자가 3보다 작거나 같으면 이동,크면 정지로 설정.
        //when
        CarGame carGame = new CarGame(names, new FixProgressCar());
        carGame.excuteRacingGame();
        //then
        assertThat(carGame.returnWinningCar().getName()).isEqualTo("bbb");

    }


}