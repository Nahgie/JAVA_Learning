package LoopTest;

import java.util.Scanner;

public class Loop_do_while {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 0, sum = 0;

        do {
            
            if (i == 0) {System.out.println("입력한 숫자만큼 더합니다.");}
            i++;
            sum += i;

        } while (i < num);

        System.out.println(sum);
        in.close();
        
    }
}
