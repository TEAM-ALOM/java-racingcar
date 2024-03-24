package Domain;
//Domain(Model)은 Controller와 View에 의존X
// ->Model 내부에 Controller와 View에 관련된 코드가 있으면 안됨.
public class Car {  //자동차의 정보 저장

    private static final int STATIC_NUM = 4;  //전진 조건 숫자(3이하의 값->멈춤, 4이상의 값->전진)

    private final Name name;                  //이름을 저장할 변수 선언
    private final Position position;          //위치를 저장할 변수 선언

    private Car(final String name, final int position){  //자동차의 정보 저장(이름,위치)
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public static Car InitialInform(final String name){
        return new Car(name,0);
    }

    public static Car EditInform(final String name, final int position){
        return new Car(name,position);
    }

    public void move(final int number){  //4이상인 경우 전진
        if(number >= STATIC_NUM){
            position.increase();
        }
    }

    public String getName(){
        return name.getName();
    }

    public int getPosition(){
        return position.getPosition();
    }

}
