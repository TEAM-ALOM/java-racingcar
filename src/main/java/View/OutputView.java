package View;

import domain.car.Car;

import java.util.List;

public class OutputView {
    static String OUTPUT_EXCUTION_RESULT_STATEMENT = "실행 결과";
    static String OUTPUT_GAME_RESULT_STATEMENT = "가 최종 우승 했습니다";
    public static void outputExcutionResultStatement(){
        System.out.println();
        System.out.println(OUTPUT_EXCUTION_RESULT_STATEMENT);
    }
    public static void outputExcutionResult(List<Car> cars){
        for(int i=0; i<cars.size(); i++){
            System.out.print(cars.get(i).getName()+" : ");
            outputExcutionResultCarProgress(cars.get(i).getProgress());
            System.out.println();
        }
        System.out.println();
    }
    public static void outputGameResult(List<String> winningCarNames){
        for(int i=0; i<winningCarNames.size()-1; i++){
            System.out.print(winningCarNames.get(i)+", ");
        }
        System.out.print(winningCarNames.get(winningCarNames.size() - 1) +OUTPUT_GAME_RESULT_STATEMENT);
    }
    public static void outputExcutionResultCarProgress(int frontNumberProgressed){
        for (int i=0; i<frontNumberProgressed; i++)
            System.out.print("-");
    }
    public static void outputErrorMessage(String e){
        System.out.println(e);
    }


}
