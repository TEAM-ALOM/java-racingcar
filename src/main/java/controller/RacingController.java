package controller;

import domain.RacingGame;
import view.InputView;
import view.ResultView;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RacingController {
    public void run(){
        try{

            final var cars = InputView.readCarNames();
            final var tryCount = InputView.readTryCount();
            tryCountValidate(tryCount);
            carNamesValidate(cars);

            final var racingGame = new RacingGame(cars, tryCount);
            race();

            ResultView.printWinners(getWinners());

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    private void race(){

    }

    private List<String> getWinners(){

    }

    private void tryCountValidate(int count){
        if(count <= 0)
            throw new IllegalArgumentException("[ERROR]시도 횟수는 양수입니다.");
    }
    private void carNamesValidate(Map<String, Integer> cars){
        Iterator<String> keys = cars.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            lengthValidate(key);
        }

    }

    private void lengthValidate(String name){
        if(name.length() > 5)
            throw new IllegalArgumentException("[ERROR]차 이름은 5자 이하여야합 니다.");
    }

}
