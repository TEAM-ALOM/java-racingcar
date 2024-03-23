package domain;



public class RandCarPos {
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
