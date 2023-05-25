package LoopTest;

import java.util.Scanner;

public class Loop_while {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int i = 0, sum = 0;

        while (i < num) {
            i++;
            sum += i;
        }

        System.out.println(sum);

        in.close();

    }
}
