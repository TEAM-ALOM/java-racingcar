package Controller;

import Domain.Cars;
import View.Input;
import util.InputValidator;
import View.Output;

import java.util.List;

public class RacingController {

    public RacingController(){}

    public void run(){
        Input input = new Input();
        Output output = new Output();
        InputValidator inputValidator = new InputValidator();

        List<String> CarList = input.readCarNames(); //차 이름 입력

        int AttemptAmount = input.readAttemptAmount(); //실행 횟수 입력
        inputValidator.validateAttemptAmount(AttemptAmount);

        Cars cars = new Cars(CarList);

        cars.playGame(AttemptAmount);
        output.outWinner(cars);

    }






}
