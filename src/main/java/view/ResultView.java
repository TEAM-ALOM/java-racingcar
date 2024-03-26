package view;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ResultView {
    public static void printWinners(List<String> winners){

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


