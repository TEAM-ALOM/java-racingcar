package Domain;

import View.Input;

import java.util.ArrayList;
import java.util.List;

public class RacingCarGenetator {
    private final List<RacingCar> racingCars = new ArrayList<>();

    public RacingCarGenetator(){
    }

    public RacingCar generateRacingCar(String carName){
        return new RacingCar(carName);
    }

    public List<RacingCar> generateRacingCars(){
        List<String> carNames = Input.inputCarName();
        List<RacingCar> racingCars = new ArrayList<>();
        for(int i = 0 ; i < carNames.size() ; i++){
            racingCars.add(generateRacingCar(carNames.get(i)));
        }
        return racingCars;
    }
}
