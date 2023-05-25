package ArrayTest;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {

        int num[] = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };

        System.out.println("삭제할 번호를 입력하세요 [ 100 , 90 , 80 , 70 , 60 , 50 , 40 , 30 , 20 , 10 ]");

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < Array.getLength(num) - Array.getLength(num) * 0.5; i++) {

            int chknum = in.nextInt();

            for (int j = 0; j < Array.getLength(num); j++) {
                if (chknum == num[j]) { num[j] = 0; }
            }
        }

        for (int k = 0; k < Array.getLength(num); k++) {

            System.out.println("배열 번호 : " + (k + 1) + " 값 : " + num[k]);

        }
        in.close();
    }
}
