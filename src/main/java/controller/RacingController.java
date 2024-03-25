package controller;

import domain.RacingCar;
import service.RaceService;

import java.util.Map;

public class RacingController {
    private final RaceService raceService;

    public RacingController(RaceService raceService) {
        this.raceService = raceService;
    }

    public void start(){
        Map<RacingCar, Integer> cars = raceService.carInit();
        raceService.race(cars);
        raceService.printResult(cars);
    }
}
