package controller;

import java.util.Arrays;


public class RacingError {
    public static boolean nameError(String[] carnames) {
        String[] b = new String[carnames.length];
        String target = "-1";

        for(int i = 0; i < carnames.length; ++i) {
            b[i] = RacingError.namelenth(carnames[i]);
        }

        boolean found = Arrays.asList(b).contains(target);

        return found;
    }

    public static String namelenth(String carname) {
        if(carname.length() > 5) return "-1";
        return "1";
    }

    public static boolean tryNumberError(int tryNumbers) {
        boolean number = false;

        if(tryNumbers == 0) number = true;

        return number;
    }
}
