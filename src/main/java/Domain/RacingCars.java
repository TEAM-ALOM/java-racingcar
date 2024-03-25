package Domain;

import View.Input;

import java.util.List;
import java.util.Map;

public class RacingCars {
    private List<RacingCar> racingCars;

    public RacingCars (List<RacingCar> racingCars){
        this.racingCars = racingCars;
    }

    public List<RacingCar> getRacingCars(){
        return racingCars;
    }
}
