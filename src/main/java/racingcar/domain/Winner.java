package racingcar.domain;

import java.util.*;

public class Winner {
    public static List<Car> getWinners(List<Car> cars){
        List<Car> winners = new ArrayList<>();
        winners.add(cars.get(0));

        for(int i = 1; i < cars.size(); i++){
            if (winners.get(0).getProgressionDegree()<cars.get(i).getProgressionDegree()){
                winners.clear();
                winners.add(cars.get(i));
            }
            if(winners.get(0).getProgressionDegree() == cars.get(i).getProgressionDegree()){
                winners.add(cars.get(i));
            }
        }

        return winners;
    }
}
