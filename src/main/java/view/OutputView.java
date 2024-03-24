package view;

import java.util.List;

public class OutputView {

    public static void printAnnouncement(){
        System.out.println("실행 결과");
    }
    public static void moveCarResult(String[] carNames, int[] carMoveRecord) {
        int idx = 0;
        for(String s : carNames)
        {
            System.out.print(s + " : ");
            String result = "-".repeat(carMoveRecord[idx++]);
            System.out.println(result);
        }
        System.out.print("\n");
    }
    public static void printWinners(List<String> winners) {
        boolean comma = false;
        for(String s : winners)
        {
            if(comma)
            {
                System.out.println(", ");
            }
            else if(!comma)
            {
                comma = true;
            }
            System.out.print(s);
        }
        System.out.println("가 최종 우승했습니다.");
    }

}
