package view;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ResultView {

    //우승자 출력 메소드
    public static void printWinners(List<String> winners){
        int i;
        for(i = 0; i < winners.size() - 1; i++){
            System.out.print(winners.get(i)+ ", ");
        }
        System.out.print(winners.get(i) + "가 최종 우승했습니다.");
    }

    //경주 단계 출력 메소드
    public void printRaceStep(Map<String, Integer> cars){
        for(Map.Entry<String, Integer> entry : cars.entrySet()){
            String name = entry.getKey();
            String distance = "-".repeat(cars.get(name));
            System.out.println(name + " : " + distance);
        }
    }

    //경주 시작 출력 메소드
    public void start(Map<String, Integer> cars){
        System.out.println("실행 결과");
        printRaceStep(cars);
        System.out.println();
    }
}


