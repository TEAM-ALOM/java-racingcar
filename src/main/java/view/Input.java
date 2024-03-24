package view;

import controller.RacingError;

import java.util.Scanner;

public class Input {
    public static String[] carNameI() {
        Output.carNameO();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] carNames = str.split(",");

        boolean b = RacingError.nameError(carNames);
        if(b) {
            Output.carNameError();
            Input.carNameI();
        }

        return carNames;
    }

    public static int tryNumbersI() {
        Output.tryNumbersO();

        Scanner sc = new Scanner(System.in);
        int tryNumbers = sc.nextInt();

        if(RacingError.tryNumberError(tryNumbers)) {
            Output.tryNumbersError();
            Input.tryNumbersI();
        }

        return tryNumbers;
    }

}
