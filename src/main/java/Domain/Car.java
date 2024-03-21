package Domain;

import util.InputValidate;

public class Car {

    private String name;
    private int position = 0;

    public Car(final String name,final int position){
        InputValidate inputValidate = new InputValidate();
        inputValidate.validateName(name);
        this.name = name;
        this.position = position;
    }

    public String getName(){
        return name;
    }
    public Integer getPosition(){
        return position;
    }

    public void forward(){ //전진
        position++;
    }

    public boolean isEnoughNumber(int Number){ //Number가 4이상인지 확인
        return Number >= 4;
    }
    public void move(int Number){ //조건 만족시 전진
        if(isEnoughNumber(Number)){
            forward();
        }
    }

    public boolean isPosition(int position){ //position에 위치하는지 확인
        return this.position == position;
    }





}
