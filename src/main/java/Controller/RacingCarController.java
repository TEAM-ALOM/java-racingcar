package Controller;

import Domain.RacingCarGenetator;
import Domain.RacingCars;
import Service.MoveCar;
import View.Input;
import View.Output;

import java.util.List;

public class RacingCarController {
    public void racingStart(){
        RacingCarGenetator racingCarGenetator = new RacingCarGenetator();
        RacingCars racingCars = new RacingCars(racingCarGenetator.generateRacingCars());
        MoveCar moveCar = new MoveCar();
        int gameNumbers = Input.inputGameNumber();
        for(int i = 0 ; i < gameNumbers ; i++){
            Output.printResults(racingCars);
            moveCar.moveCars(racingCars);
        }
        Output.printResults(racingCars);
        Output.printFinalResult(racingCars);
    }

}
