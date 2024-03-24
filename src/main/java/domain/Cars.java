package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;
    private NumberGenerator numberGenerator = new NumberGenerator();

    public Cars(List<String> carNameList) {
        cars = makeCarObject(carNameList);
    }
    public List<Car> makeCarObject(List<String> carNames){
        List<Car> cars = new ArrayList<>();
        for(String name : carNames){
            cars.add(new Car(name));
        }
        return cars;
    }

    public void moveAllCars(){
        for(Car car : cars){
            int movePoint = numberGenerator.generate();
            car.move(movePoint);
        }
    }
    public int findMaxPosition(){
        int maxPosition = 0;
        for(Car car : cars){
            int carPosition = car.getPosition();

            if (carPosition > maxPosition){
                maxPosition = carPosition;
            }
        }

        return maxPosition;
    }



    public List<String> findWinner(int maxPosition){
        List<String> winners = new ArrayList<>();
        for(Car car : cars){
            int carPosition = car.getPosition();

            if(carPosition == maxPosition){
                winners.add(car.getCarName());
            }
        }
        return winners;
    }

    public List<Car> getCars() {
        return cars;
    }
}
