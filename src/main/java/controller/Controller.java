package controller;

import View.InputView;
import View.OutputView;
import domain.CarGame;
import domain.car.RandomProgressCar;

public class Controller {

    public void startGame(){
        try {
            String[] carNames = InputView.inputCarNames();
            CarGame carGame = new CarGame(carNames,new RandomProgressCar());
            int tryNumber = InputView.inputGameTryNumber();
            validateTryNumber(tryNumber);
            OutputView.outputExcutionResultStatement();
            excuteGame(carGame, tryNumber);
            OutputView.outputGameResult(carGame.returnWinningCarNames());
        }
        catch (IllegalArgumentException e){
            OutputView.outputErrorMessage(e.getMessage());
        }
    }

    public void excuteGame(CarGame carGame,int tryNumber){
        for(int i=0; i<tryNumber; i++) {
            carGame.excuteRacingGame();
            OutputView.outputExcutionResult(carGame.getCars());
        }
    }
    public static void validateTryNumber(int tryNumber){
        if(tryNumber<=0)
            throw new IllegalArgumentException("횟수는 양수여야합니다.");
    }
}
