package racingcar.view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView { //입력관련 메서드 집합
    Scanner sc = new Scanner(System.in);

    public String[] getNames() {
        System.out.print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputname = sc.next();
        String[] names = inputname.split(","); //쉼표로 분리해서 넣기
        try {
            nameRange(names); //글자가 5개 이상이거나,
            sameName(names); //같은 이름이 있을 경우
        } catch (IllegalArgumentException e) {
            getNames();
        }
        return names;
    }

    private void nameRange(String[] names) {
        for (String name : names) {
            if (name.length() > 5) {
                System.out.print("글자가 5자리 아래여야만함");
                throw new IllegalArgumentException();
            }
        }
    }

    private void sameName(String[] names) {
        List<String> check = new ArrayList<>();
        for (String name : names) {
            if (check.contains(name)) {
                System.out.print("중복이름 X");
                throw new IllegalArgumentException();
            } else {
                check.add(name);
            }
        }
    }

    public int getRound() {
        System.out.print("시도할 회수는 몇회인가요?");
        String inputround = sc.next();
        int round = 0;
        try {
            round = Integer.parseInt(inputround);
        } catch (IllegalArgumentException e) {
            System.out.print("숫자나 입력하세여");
            getRound();
        }
        return round;
    }

}