package domain;

//자동차들의 이름과 위치
public class Car {
    private static final int MOVED_LOWER_BOUND = 4;

    private final Name name;
    private final Position position;

    //기본생성자
    private Car(final String name, final int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    //Car name 입력받았을 때
    public static Car from(final String name){
        return new Car(name, 0);
    }

    //Car position 입력받았을 때
    public static Car of(final String name, final int position){
        return new Car(name, position); //객체 생성?
    }
    //궁금증.. 근데 그러면 new Car 형식이 두 개인데 객체가 두개씩 생성되는 거 아닌가...

    //움직임
    public void move(final int number){
        if(number >= MOVED_LOWER_BOUND){
            position.increase(); //4 이상이면 위치 증가
        }
    }
    //car 이름 반환
    public String getName(){
        return name.getName();
    }

    //car position 반환
    public int getPosition(){
        return position.getPosition();
    }
}