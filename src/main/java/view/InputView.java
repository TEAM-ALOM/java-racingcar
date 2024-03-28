package view;

import java.util.*;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    //차이름 입력 메소드
    public static Map<String, Integer> readCarNames(){
        try{
            Map<String, Integer> cars = new HashMap<>();
            System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
            String line = scanner.nextLine();
            String[] str = line.split(",");
            for(int i = 0; i<str.length; i++){
                cars.put(str[i], 1);
            }
            return cars;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    //시도횟수 입력 메소드
    public static int readTryCount(){
        System.out.println("시도할 횟수는 몇회인가요?");
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    //시도횟수 유효성 검사 메소드
    public static void tryCountValidate(int count){
        if(count <= 0)
            throw new IllegalArgumentException("[ERROR]시도 횟수는 양수입니다.");
    }

    //차이름 유효성 검사 메소드
    public static void carNamesValidate(Map<String, Integer> cars){
        Iterator<String> keys = cars.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            lengthValidate(key);
        }

    }

    private static void lengthValidate(String name){
        if(name.length() > 5)
            throw new IllegalArgumentException("[ERROR]차 이름은 5자 이하여야합 니다.");
    }

}
