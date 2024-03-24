package Domain;

public class Position {         //자동차의 위치 저장
    private int position;

    public Position(final int position){
        this.position = position;
    }

    public void increase(){     //자동차를 전진시키는 메서드
        position++;
    }
    public int getPosition(){
        return position;
    }
}
