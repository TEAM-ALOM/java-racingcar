package view;

import domain.Car;

import java.util.List;

public class OutputView {

    private static final String PRINT_WINNER_TEXT = "%s가 최종 우승했습니다.";

    public void printResult(){
        System.out.println("실행 결과");
    }

    public void printStatus(List<Car> cars) {
        for (Car car : cars) {
            int currentPosition = car.getPosition();
            String carName = car.getCarName();
            System.out.printf(carName + ":" +' ');
            printPosition(currentPosition);
        }
    }

    private void printPosition(int count){
        for(int i=0;i<count;i++){
            System.out.printf("-");
        }
        System.out.println();
    }

    public void printWinner(List<String> winners){
        String winnerText = String.join(", ", winners);
        System.out.printf(PRINT_WINNER_TEXT,winnerText);
    }

}
