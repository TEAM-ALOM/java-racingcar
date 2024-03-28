package view;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final int MAX_NUM = 5;
    private static List<String> list;
    private static final String ADD_CARS =  "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String CNT = "시도할 회수는 몇회인가요?";
    private static Scanner scanner = new Scanner(System.in);

    public static String inputCarNames() {
        System.out.println(ADD_CARS);
        String str = scanner.nextLine();
        return str;
    }
    public static List<String> makeCarList(String str){
        String[]ret = str.split(",");
        validateNum(ret);
        addList(ret);
        return list;
    }

    public static int totCnt(){
        System.out.println(CNT);
        String num = scanner.nextLine();
        scanner.close();
        return strToInt(num);
    }


    private static int strToInt(String num){
        try{
            return Integer.parseInt(num);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException();
        }
    }
    private static void validateNum(String[] s){
        for(String name : s){
            if(name.length() > MAX_NUM || name.length() == 0 || name.contains(" ")){
                throw new IllegalArgumentException();
            }
        }
    }
    private static void validateName(){
        if(list.size() != list.stream().distinct().count()){//이름 간 중복 여부 확인하기 위함
            throw new IllegalArgumentException();
        }
    }

    private static void addList(String[]str){
        list = new ArrayList<>();
        for(String s : str){
            list.add(s);
        }
        validateName();
    }
}


