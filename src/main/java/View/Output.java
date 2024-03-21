package View;

import Domain.Car;
import Domain.Cars;

import java.util.Arrays;
import java.util.List;

public class Output {
    public Output(){}



    public void outPosition(int position){
        for(int i=0;i<position;i++){
            System.out.print("-");
        }
    }

    public void outCurrentSituation(List<Car> cars){

        for(Car car:cars){
            int CurrentCarPosition = car.getPosition();
            System.out.print(car.getName()+" : ");
            outPosition(CurrentCarPosition);
            outEnter();
        }
    }
    public void outEnter(){
        System.out.println("");
    }

    public void outWinner(Cars cars){
        String Winners = String.join(",",cars.getWinner());
        System.out.println(Winners+"가 최종 우승했습니다.");
    }
}
