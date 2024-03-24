package view;

import java.util.List;
import java.util.Scanner;

public class inputView {
    private static final String NAME_GET = "경주할 자동차 이름을 입력하세요.";
    private static final String NUMBER_GET = "시도할 횟수는 몇회인가요?";

    public static List<String> nameGet(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(NAME_GET);
        scanner.nextLine().split(",");

    }



}
