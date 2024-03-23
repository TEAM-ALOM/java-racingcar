package domain.car;

import java.util.List;

public interface Car {
    void excuteProgressOrStopCar();
    int progressCar();
    int getProgress();
    String getName();
    Car returnCar(String name);
}
