package view;

public class ExceptionMessage {

    // 1. 자동차 이름 5자 이상
    public static void isInvalidNameLength() {
        System.out.println("[ERROR] 자동차의 이름은 1자 이상 5자 이하여야 한다.");
    }

    // 2. 시도 횟수 음수 혹은 0
    public static void isInvalidTryCount() {
        System.out.println("[ERROR] 시도 횟수는 양수여야 한다.");
    }

    // 3. 자동차 이름 중복 확인
    public static void isDuplicateCarName() {
        System.out.println("[ERROR] 자동차 이름은 중복되지 않아야 한다.");
    }

}
