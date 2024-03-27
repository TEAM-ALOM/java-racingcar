package controller;

import domain.RacingGame;
import view.InputView;
import view.ResultView;

import java.util.*;


public class RacingController {
    public void run(){
        try{
            final var cars = InputView.readCarNames();
            final var tryCount = InputView.readTryCount();
            InputView.carNamesValidate(cars);
            InputView.tryCountValidate(tryCount);

            final var racingGame = new RacingGame(cars, tryCount);
            race(racingGame);

            ResultView.printWinners(getWinners(racingGame.getCars()));

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    private void race(RacingGame racingGame){
        ResultView.Start(racingGame.getCars());
        for(int i = 0; i < racingGame.getTryCount(); i++){
            generateRandomDistance(racingGame.getCars());
        }
    }
    private void generateRandomDistance(Map<String, Integer> cars){
        for(Map.Entry<String, Integer> entry : cars.entrySet()){
            Random random = new Random();
            int randomNum = random.nextInt(10);
            RacingGame.updateDistance(entry.getKey(), randomNum);
        }
    }

    private List<String> getWinners(Map<String, Integer> cars){
        List<String> winners = new ArrayList<>();


        return winners;
    }

}
