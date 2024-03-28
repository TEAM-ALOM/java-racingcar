package controller;

import domain.RacingGame;
import util.GenerateRandomDistance;
import view.InputView;
import view.ResultView;

import java.util.*;


public class RacingController {
    public void run(){
        try{
            final var cars = InputView.readCarNames();  //차이름 입력받기
            final var tryCount = InputView.readTryCount();  //시도 횟수 입력받기

            final var racingGame = new RacingGame(cars, tryCount);
            race(racingGame);   //경주 실행

            ResultView.printWinners(getWinners(racingGame.getCars()));  //우승자 출력

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }


    //경주 실행
    private void race(RacingGame racingGame){
        ResultView resultView = new ResultView();
        resultView.start(racingGame.getCars());

        for(int i = 0; i < racingGame.getTryCount(); i++){
            GenerateRandomDistance.generateRandomDistance(racingGame.getCars());
            resultView.printRaceStep(racingGame.getCars());
            System.out.println();
        }
    }


    //우승자 구하는 메소드
    private List<String> getWinners(Map<String, Integer> cars){
        List<String> winners = new ArrayList<>();
        int maxValue = Collections.max(cars.values());

        for(Map.Entry<String, Integer> entry : cars.entrySet()){    //이거 메소드로 분리하는게 가독성이 더 떨어질듯?
            if(entry.getValue() == maxValue){
                winners.add(entry.getKey());
            }
        }
        return winners;
    }
}
