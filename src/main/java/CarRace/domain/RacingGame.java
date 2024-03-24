package CarRace.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final List<Car> cars; // 자동차 객체를 담을 리스트
    private final int tryCount; // 시도 회수
    private final List<String> winners; // 우승자를 담을 리스트

    public RacingGame(List<String> carNames, int tryCount) { // 차 이름과 시도 회수를 받아 RacingGame 객체 생성
        this.cars = new ArrayList<>();
        this.tryCount = tryCount;
        this.winners = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName)); // 입력받은 차 이름을 바탕으로 Car 객체 생성
        }
    }

    public void play() { // 레이스를 시작하는 메소드
        for (int i = 0; i < tryCount; i++) { // 시도 회수만큼 레이스를 진행
            playOneRound(); // 한 라운드를 진행하면
            printCurrentPositions(); // 현재 위치 출력
        }
        determineWinners(); // 레이스가 끝나면 우승자를 결정
    }

    private void playOneRound() { // 한 라운드를 진행하는 메소드
        for (Car car : cars) {
            car.move();
        }
    }

    private void printCurrentPositions() { // 현재 위치를 출력하는 메소드
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition())); // 각 자동차 별로 getPosition()을 통해 현재 위치를 받아와서 출력
        }
        System.out.println();
    }

    private void determineWinners() { // 우승자를 결정하는 메소드
        int maxPosition = 0; // 가장 멀리 간 자동차의 위치
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition()); // 현재까지 최대 위치와 각 자동차의 위치를 비교하여 최대 위치를 갱신
        }
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName()); // 각 자동차의 위치와 최대위치를 비교하여 같으면 해당 자동차의 이름을 우승자 리스트에 추가
            }
        }
    }

    public List<String> getWinners() { // 우승자 리스트를 반환하는 메소드
        return winners;
    }
}
