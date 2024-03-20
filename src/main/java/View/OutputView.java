package View;

import domain.Car;

import java.util.List;

public class OutputView {
    static String OUTPUT_EXCUTION_RESULT_STATEMENT = "실행 결과";
    static String OUTPUT_GAME_RESULT_STATEMENT = "가 최종 우승 했습니다";
    public static void outputExcutionResultStateMent(){
        System.out.println(OUTPUT_EXCUTION_RESULT_STATEMENT);
    }
    public static void outputExcutionResult(Car[] cars){
        for(int i=0; i<cars.length; i++){
            System.out.print(cars[i].getName()+" : ");
            OutputExcutionResultCarProgress(cars[i].getProgress());
        }
    }
    public static void outputGameReslut(List<String> winningCarNames){
        for(int i=0; i<winningCarNames.size()-1; i++){
            System.out.print(winningCarNames.get(i)+", ");
        }
        System.out.print(winningCarNames.get(winningCarNames.size() - 1) +OUTPUT_GAME_RESULT_STATEMENT);
    }
    public static void OutputExcutionResultCarProgress(int frontProgressed){
        for (int i=0; i<frontProgressed; i++)
            System.out.print("-");
    }

}
