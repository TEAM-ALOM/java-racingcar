package view;

import model.domain.RacingGame;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
//    private static final String RESULT = "실행 결과";
//    private static final String WINNER = "최종 우승자 : ";

    private static final String RESULT = "result";
    private static final String WINNER = "winner : ";

    public static void result(List<RacingGame> carlist) {
        System.out.println(RESULT);
        for (RacingGame cars : carlist) {
            System.out.printf("%s : ", cars.getCarName());
            printPos(cars);

        }
        System.out.println();
    }
    private static void printPos(RacingGame Car){
        for(int i = 0; i < Car.getPos(); i++){
            System.out.printf("-");
        }
        System.out.println();
    }

    public static void printWinner(List<String>str){
        System.out.println(WINNER);
        System.out.println(str.stream().collect(Collectors.joining(", ")));
    }
}