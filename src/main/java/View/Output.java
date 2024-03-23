package View;

import Domain.Car;
import Domain.Cars;

import java.util.Arrays;
import java.util.List;

public class Output {
    public Output(){}

    public void outPosition(int position){ //현재 의치 - 로 출력
        for(int i=0;i<position;i++){
            System.out.print("-");
        }
    }

    public void outCurrentSituation(List<Car> cars){ //각 차들의 현재 위치 출력

        for(Car car:cars){
            int CurrentCarPosition = car.getPosition();
            System.out.print(car.getName()+" : ");
            outPosition(CurrentCarPosition);
            System.out.println("");
        }
    }

    public void outWinner(Cars cars){ //우승자 출력
        String Winners = String.join(",",cars.getWinner());
        System.out.println(Winners+"가 최종 우승했습니다.");
    }

}
