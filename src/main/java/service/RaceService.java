package service;

import domain.RacingCar;
import util.CarGenerator;
import util.FindMaxValue;
import validator.CarNameValidator;
import validator.RaceNumberValidator;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RaceService {
    private final InputView inputView;
    private final OutputView outputView;

    public RaceService(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public Map<RacingCar, Integer> carInit(){
        List<String> carNameInput=inputView.readCarName();
        CarNameValidator carNameValidator = new CarNameValidator();
        for (String carName : carNameInput) {
            carNameValidator.validate(carName);
        }
        Map<RacingCar, Integer> cars = new CarGenerator().generate(carNameInput);
        return cars;
    }

    public void race(Map<RacingCar, Integer> cars){
        String input = inputView.readRacingCount();
        new RaceNumberValidator().validate(input);
        System.out.println("실행결과");
        for (int i=0; Integer.parseInt(input)>i;i++){
            go(cars);
            outputView.printRace(cars);
            System.out.println();
        }
    }

    public void go (Map<RacingCar, Integer> cars){
        Random random = new Random();
        for (RacingCar racingCar : cars.keySet()) {
            if (random.nextInt(10)>=4){
                cars.put(racingCar,cars.get(racingCar)+1);
            }
        }
    }

    public void printResult(Map<RacingCar, Integer> cars){
        int maxPosition = new FindMaxValue().find(cars);
        List<String> winners = new ArrayList<>();
        for (RacingCar racingCar : cars.keySet()) {
            if (cars.get(racingCar)==maxPosition){
                winners.add(racingCar.getName());
            }
        }
        outputView.printResult(winners);

    }

}
