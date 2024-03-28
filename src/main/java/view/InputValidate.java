package view;

import java.util.HashSet;
import java.util.List;

public class InputValidate {


    public static void isValidCarName(List<String> carList) {
        for (String s : carList) {
            isValidCarNameLength(s);
        }
    }

    public static void isValidCarNameLength(String carName) {
        if (carName.length() < 1 || carName.length() > 5) {
            ExceptionMessage.isInvalidNameLength();
            throw new IllegalArgumentException();
        }
    }

    public static void isDuplicateCarName(List<String> carList) {
        HashSet<String> names = new HashSet<>(carList);
        System.out.println();
        if (names.size() != carList.size()) {
            ExceptionMessage.isDuplicateCarName();
            throw new IllegalArgumentException();
        }
    }
}
