package controller;

import model.Car;
import model.CarFactory;
import view.Input;
import view.Output;

import java.util.List;

public class RacingMain {

    public static void main(String[] args) {
        /*var carFactory = new CarFactory();
        var cars = carFactory.create();*/

        String[] carNames = Input.carNameI();
        int tryNumbers = Input.tryNumbersI();

        int[] saveNumbers = RacingGame.racingStart(carNames, tryNumbers);

        Output.racingResultO(carNames, saveNumbers);

        List<String> gamewinner = RacingGame.gameWinner(saveNumbers, carNames);

        Output.racingWinner(gamewinner);
    }
    //입력, 클래스랑 메소드 호출
}
