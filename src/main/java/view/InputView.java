package view;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class InputView {
    private static List<String> list;
//    private static final String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
//    private static final String INPUT_TRY_NUMBER = "시도할 회수는 몇회인가요?";

    private static final String INPUT_CAR_NAME = "what car.";
    private static final String INPUT_TRY_NUMBER = "number";


    private static Scanner scanner = new Scanner(System.in);

    public static String inputCarName() {
        System.out.println(INPUT_CAR_NAME);
        return scanner.nextLine();
    }

    //인트 숫자로 바꾸기
//    private static int strToInt(String num){
//        try{
//            return Integer.parseInt(num);
//        }catch (NumberFormatException e){
//            throw new IllegalArgumentException();
//        }
//    }

    //자동차 리스트 만들기
    public static List<String> makeCarList(String str){
        String[]ret = str.split(",");
//        validateNum(ret);
        addList(ret);
        return list;
    }

    //예외 케이스
//    private static void validateNum(String[] s){
//        for(String name : s){
//            if(name.length() > MAX_NUM || name.length() == 0 || name.contains(" ")){
//                throw new IllegalArgumentException();
//            }
//        }
//    }
//    private static void validateName(){
//        if(list.size() != list.stream().distinct().count()){//이름 간 중복 여부 확인하기 위함
//            throw new IllegalArgumentException();
//        }
//    }


//숫자 입력받기
    public static int inputTryNum(){
        System.out.println(INPUT_TRY_NUMBER);
        int num = Integer.parseInt(scanner.nextLine());
        scanner.close();
        return num;
    }

    //에드 리스트
    private static void addList(String[]str){
        list = new ArrayList<>();
        for(String s : str){
            list.add(s);
        }
//        validateName();
    }


}
