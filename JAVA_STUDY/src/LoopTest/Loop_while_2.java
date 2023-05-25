package LoopTest;

public class Loop_while_2 {

    public static void main(String[] args) {
        
        int i = 0;

        while (true) {

            System.out.println((i + 1) + "번째");
            i++;

            if (i == 100) {

                System.out.println("반복문을 탈출했습니다.");
                break;

            }

        }

    }

}
