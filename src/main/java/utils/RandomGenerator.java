package utils;

//인터페이스의 이유
public class RandomGenerator implements NumberGenerator  {
    public int generate(){
        return (int) (Math.random() * 10);
    }
}
