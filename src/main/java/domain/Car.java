package domain;

public class Car implements Comparable<Car> {

    private static final int MOVE_MIN_BOUND = 4;

    private final Name name;
    private final Position position;



    public Car(final String name) {
        this.name = new Name(name);
        this.position = new Position();
    }
    public void move(final int value){
        if (MOVE_MIN_BOUND <= value){
            position.increase();
        }
    }
    public boolean isSamePos(final Car car){
        return this.position.equals(car.position);
    }
    @Override
    public int compareTo(final Car opponent){
        return this.position.compareTo(opponent.position);
    }
    public String getName(){
        return name.getValue();
    }
    public int getPosition(){
        return position.getValue();
    }

}
