package controller;

import domain.AttemptNumber;
import domain.Cars;
import dto.CarDto;
import utils.NumberGenerator;
import utils.RandomGenerator;
import view.InputView;
import view.OutputView;

import java.io.IOException;
import java.util.List;

public class RacingGameController {

    private final NumberGenerator numberGenerator;

    public RacingGameController(){
        this.numberGenerator = new RandomGenerator();
    }

    //run 매서드 게임 실행을 위한 매서드
    //자동차 이름 입력, 시도 횟수 입력, 경주 진행, 최종 우ㅇ승자 출력
    public void run() throws IOException {
        Cars cars = getCars();
        System.out.println("check");
        AttemptNumber attemptNumber = getAttemptNumber();
        race(cars, attemptNumber);
        printWinners(cars);
    }

    private Cars getCars() throws IOException {
        List<String> carNames = InputView.readCarNames();
        try {
            return Cars.from(carNames);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCars();
        }
    }


    private AttemptNumber getAttemptNumber() throws IOException{
        try{
            int number = InputView.readAttemptNumber(); //시도할 횟수 입력
            return new AttemptNumber(number);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return getAttemptNumber(); //재귀
        }
    }

    private void race(final Cars cars, final AttemptNumber attemptNumber) throws IOException{
        OutputView.printResult(); //"실행결과" 메세지 출력
        while(attemptNumber.isRemain()){
            attemptNumber.decrease();
            cars.moveAll(numberGenerator);
            printStatus(cars);
        }
    }

    private void printStatus(final Cars cars){
        List<CarDto> carDtos = CarDto.getInstances(cars);
        OutputView.printStatus(carDtos);
    }

    private void printWinners(final Cars cars) {
        Cars winnerCars = cars.findWinners();
        List<CarDto> winnerCarDtos = CarDto.getInstances(winnerCars);
        OutputView.printWinners(winnerCarDtos);
    }
}
