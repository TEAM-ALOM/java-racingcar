package domain;

import validator.CarNameValidator;

public class RacingCar {
    private final String name;

    public RacingCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
