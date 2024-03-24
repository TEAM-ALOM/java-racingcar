package domain;

public class NumberGenerator {
    public int generate() {
        int num = (int) (Math.random() * 10);
        return num;
    }
}
