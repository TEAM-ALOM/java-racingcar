package controller;

import View.InputView;
import View.OutputView;
import domain.Car;
import domain.CarGame;

import java.util.List;

public class Controller {

    public void startGame(){
        try {
            String[] carNames = InputView.inputCarNames();
            CarGame carGame = new CarGame(carNames);
            int tryNumber = InputView.inputGameTryNumber();
            OutputView.outputExcutionResultStateMent();
            excuteAllRacingGame(carGame, tryNumber);
            OutputView.outputGameResult(carGame.returnWinningCarNames());
        }
        catch (IllegalArgumentException e){
            OutputView.outputErrorMessage(e.getMessage());
        }
    }

    public void excuteAllRacingGame(CarGame carGame,int tryNumber){
        for(int i=0; i<tryNumber; i++) {
            carGame.excuteRacingGame();
            OutputView.outputExcutionResult(carGame.getCars());
        }
    }
}
