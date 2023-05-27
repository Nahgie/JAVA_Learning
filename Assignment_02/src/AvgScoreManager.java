import java.util.Scanner;

public class AvgScoreManager {

    public static void main(String[] args) throws Exception {

        Scanner I_DATA = new Scanner(System.in);
        int T_Score = 0, AVG_Counter = 0, Result = 0;

        do {
            System.out.print("정수를 입력하세요 : ");
            Result += (T_Score = I_DATA.nextInt());

            try {

                if (T_Score < 0 || T_Score > 100) {

                    I_DATA.close();
                    throw new Exception();

                }

            } catch (Exception e) {

                System.out.println("허용된 값이 아니거나 허용된 조작이 아닙니다.");
                I_DATA.close();
                throw e;

            }

            AVG_Counter++;

        } while (T_Score != 0);

        AVG_Counter--;

        System.out.print("합계는 " + Result + "입니다. 평균은 " + (Result / AVG_Counter) + "입니다.\n");

        I_DATA.close();
    }
}
