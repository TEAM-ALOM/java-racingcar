package Domain;

public class Car {

    private String name;
    private int position = 0;

    public Car(final String name,final int position){
        validate(name);
        this.name = name;
        this.position = position;
    }

    public String getName(){
        return name;
    }
    public Integer getPosition(){
        return position;
    }

    public void forward(){
        position++;
    }

    public boolean isEnoughNumber(int Number){
        return Number >= 4;
    }
    public void move(int Number){
        if(isEnoughNumber(Number)){
            forward();
        }
    }

    public boolean isPosition(int position){
        return this.position == position;
    }

    public void validate(String name){
        if(name.isEmpty()){
            throw new IllegalArgumentException("이름이 존재하지 않습니다");
        }
        if(name.length() > 5){
            throw new IllegalArgumentException("이름이 6글자 이상입니다");
        }
    }


}
