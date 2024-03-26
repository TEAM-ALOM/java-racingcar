package controller;

import domain.RacingGame;
import view.InputView;
import view.ResultView;

import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class RacingController {
    public void run(){
        try{

            final var cars = InputView.readCarNames();
            final var tryCount = InputView.readTryCount();
            InputView.carNamesValidate(cars);
            InputView.tryCountValidate(tryCount);

            final var racingGame = new RacingGame(cars, tryCount);
            race(racingGame);

            ResultView.printWinners(getWinners());

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    private void race(RacingGame racingGame){
        ResultView.Start(racingGame.getCars());
    }


    private List<String> getWinners(){

    }

}
