package CarRace.domain;

public class Car {
    private final String name;
    private int position;

    public Car(String name) { // 자동차 이름을 받아서 객체 생성
        this.name = name;
        this.position = 0;
    }

    public String getName() { // 자동차 이름을 반환
        return name;
    }

    public int getPosition() { // 자동차의 위치를 반환
        return position;
    }

    public void move() { // 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춤
        int randomValue = (int) (Math.random() * 10);
        if (randomValue >= 4) {
            position++;
        }
    }
}
