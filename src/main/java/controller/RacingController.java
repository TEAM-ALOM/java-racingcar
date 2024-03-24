package controller;

import domain.Cars;
import domain.NumberGenerator;
import view.InputView;
import view.OutputView;

import java.util.List;

public class RacingController {
    //NumberGenerator numberGenerator = new NumberGenerator();
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();


    public void startRacing(){
        Cars cars;
        List<String> winners;
        int count;

        cars = new Cars(inputView.readCarName());
        count = inputView.readCount();

        for(int i=0;i<count;i++){
            race(cars);
        }

        winners = cars.findWinner(cars.findMaxPosition());
        outputView.printWinner(winners);
    }

    private void race(Cars cars){
        cars.moveAllCars();
        outputView.printStatus(cars.getCars());
    }


}
