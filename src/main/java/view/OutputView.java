package view;

import domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    private static final String RESULT = "실행 결과";
    private static final String WINNER = "최종 우승자 : ";

    public static void result(List<Car> car){
        System.out.println(RESULT);
        for(Car c : car){
            System.out.printf("%s : ", c.getCname());
            printPos(c);

        }
        System.out.println();
    }
    private static void printPos(Car c){
        for(int i = 0; i < c.getPos(); i++){
            System.out.printf("-");
        }
        System.out.println();
    }

    public static void printWinner(List<String> str){
        System.out.println(WINNER);
        System.out.println(str.stream().collect(Collectors.joining(", ")));
    }
}
