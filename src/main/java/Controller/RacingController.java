package Controller;

import Domain.Cars;
import View.Input;
import util.InputValidate;
import View.Output;

import java.util.List;

public class RacingController {

    public RacingController(){}

    public void run(){
        Input input = new Input();
        Output output = new Output();
        InputValidate inputValidate = new InputValidate();

        List<String> CarList = input.readCarNames(); //차 이름 입력

        int AttemptAmount = input.readAttemptAmount(); //실행 횟수 입력
        inputValidate.validateAttemptAmount(AttemptAmount);

        Cars cars = new Cars(CarList);

        cars.playGame(AttemptAmount);
        output.outWinner(cars);

    }






}
