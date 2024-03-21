package Domain;

public class Car {

    private String name;
    private int position = 0;
    public Car(final String name,final int position){
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


}
