package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputView {
    final private static String str1 = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    final private static String str2 = "시도할 회수는 몇회인가요?";
    final private static Scanner in = new Scanner(System.in);
    public static ArrayList<String> getCarNames(){
        System.out.println(str1);
        String s = in.next();
        String[] names = s.split(",");

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));

        return nameList;
    }

    public static int getTryCount(){
        System.out.println(str2);

        return in.nextInt();
    }

}
