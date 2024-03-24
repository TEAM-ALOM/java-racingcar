package controller;

import domain.Car;
import domain.Cars;
import domain.TryCount;
import utils.RandomNumberGenerator;
import view.InputView;
import view.OutputView;

import java.io.IOException;
import java.util.List;

public class RacingCarController {

    private final RandomNumberGenerator randomNumberGenerator;

    public RacingCarController() {
        this.randomNumberGenerator = new RandomNumberGenerator();
    }

    public void run() {
        Cars cars = getCars();
        TryCount tryCount = getTryCount();
        race(cars, tryCount);
        printWinner(cars);
    }

    private Cars getCars() {
        List<String> carNames = InputView.readCarNames();
        try {
            return new Cars(carNames);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCars();   //올바른 입력 넣을 때까지 반복
        }
    }

    private TryCount getTryCount() {
        try {
            int number = InputView.readTryCount();
            return new TryCount(number);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getTryCount();   //올바른 입력 넣을 때까지 반복
        }
    }

    private void race(Cars cars, TryCount tryCount) {
        OutputView.printResult();
        while (tryCount.isRemain()) {
            cars.moveCars(randomNumberGenerator);
            printStatus(cars);
            tryCount.decrease();
        }
    }

    private void printStatus(Cars cars) {
        List<Car> carList = cars.getCars();
        OutputView.printStatus(carList);
    }

    private void printWinner(Cars cars) {
        List<Car> winnerList = cars.findWinner();
        OutputView.printWinners(winnerList);
    }
}
