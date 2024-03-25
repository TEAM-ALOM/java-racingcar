package Service;

import Domain.RacingCar;
import Domain.RacingCars;

import java.util.List;
import java.util.Map;

public class MoveCar {
    public int generateRandomNumber(){
        return (int)(Math.random()*10);
    }

    public void moveCar(RacingCar racingCar){
        if(generateRandomNumber() >= 4){
            racingCar.moveCarPosition();
        }
    }

    public void moveCars(RacingCars racingCars){
       List<RacingCar> racingCarList = racingCars.getRacingCars();
       racingCarList.stream()
               .forEach(this::moveCar);

       //return racingCarList;
    }
}
