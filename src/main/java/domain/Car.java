package domain;

public class Car {

    private static final int MOVED_LOWER_BOUND = 4; //기준으로 이상이면 전진/ 이하면 후진

    private final Name name; //이름
    private final Position position;//위치

    private Car(final String name, final int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public static Car from(final String name) { //Car 이름 받아서 위치 0으로 초기화
        return new Car(name, 0);
    }

    public static Car of(final String name, final int position) { //Car이름 위치 받음
        return new Car(name, position);
    }

    public void move(final int number) {
        if (number >= MOVED_LOWER_BOUND) { //4이상이면
            position.increase(); //전진
        }
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }
}