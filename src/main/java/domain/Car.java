package domain;

public class Car {
    RandCarPos p = new RandCarPos();
    private static final int canMove = 4;

    private String cname;
    private int pos;
    public Car(String cname){
        this.cname = cname;
        this.pos = 0;//초기 position은 모두 0으로 동일하기 때문에
    }
    public void move(){
        int num = p.makeRandNum();
        if(num >= canMove){
            this.pos++;
        }
    }

    public String getCname(){
        return cname;
    }
    public int getPos(){
        return pos;
    }

}
