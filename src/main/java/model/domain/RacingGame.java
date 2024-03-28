package model.domain;

public class RacingGame {

    RandomNum randomNum = new RandomNum();
    private static final int canMove = 4;

    private String carname;
    private int pos;
    public RacingGame(String carname){
        this.carname = carname;
        this.pos = 0;//초기 position은 모두 0으로 동일하기 때문에
    }
    public void move(){
        int num = randomNum.makeRandNum();
        if(num >= canMove){
            this.pos++;
        }
    }

    public String getCarName(){
        return carname;
    }
    public int getPos(){
        return pos;
    }







    public class RandomNum {
        private static final int maxNum = 9;
        private static final int minNum = 0;


        public int makeRandNum(){
            int ret = (int)(Math.random()*10);
            validateRange(ret);
            return ret;
        }
        private void validateRange(int num){
            if(num < minNum || num > maxNum){
                throw new IllegalArgumentException();
            }
        }
    }




}
