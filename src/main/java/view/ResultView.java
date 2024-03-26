package view;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ResultView {
    public static void printWinners(List<String> winners){
        int i;
        for(i = 0; i < winners.size() - 1; i++){
            System.out.print(winners.get(i) + ", ");
        }
        System.out.print(winners.get(i) + "가 최종 우승했습니다.");
    }

    public static void printRaceStep(Map<String, Integer> cars){
        Iterator<String> iterator = cars.keySet().iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            String distance = "-".repeat(cars.get(name));
            System.out.println(name + " : " + distance);
        }
    }

    public static void Start(Map<String, Integer> cars){
        System.out.println("실행 결과");
        printRaceStep(cars);
    }
}


