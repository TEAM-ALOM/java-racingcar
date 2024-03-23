package domain;

public class CarName {
    private final String carName;

    public CarName(String carName) {
        validateCarName(carName);
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    private void validateCarName(String carName) {  //이름 글자수 확인(없거나, 5글자 초과일 시)
        if (carName.isEmpty()) {
            throw new IllegalArgumentException("이름이 반드시 존재해야 합니다.");
        }
        if (carName.length() > 5) {
            throw new IllegalArgumentException("이름은 5글자 이하여야 합니다.");
        }
    }
}
