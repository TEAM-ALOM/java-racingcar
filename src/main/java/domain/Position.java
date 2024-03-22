package domain;

public class Position {

    private int position; //포지션1, 필드


    //생성자=인스턴스 초기화 매서드
    public Position(final int position){ //포지션1 (1과 다른거)
        //헷갈리니까 this 사용
        this.position = position; //포지션1=포지션2
    }

    //위치 증가
    public void increase(){
        position++;
    }

    //위치 반환
    public int getPosition(){
        return position;
    }


}
