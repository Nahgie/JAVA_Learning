package BranchTest;

import java.util.Scanner;

public class BranchTest_2 {

    public static void main(String[] args) throws Exception {

        System.out.println("사칙연산 계산기 : 1.덧셈 / 2.뺄셈 / 3.곱셈 / 4.나눗셈");
        Scanner in = new Scanner(System.in);

        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        switch (in.nextInt()) {

            case 1:

                System.out.println(num1.nextInt() + num2.nextInt());
                break;

            case 2:
                System.out.println(num1.nextInt() - num2.nextInt());
                break;

            case 3:
                System.out.println(num1.nextInt() * num2.nextInt());
                break;

            case 4:
                System.out.println(num1.nextDouble() / num2.nextDouble() );
                break;

            default:
                System.out.println("유효값이 아닙니다.");
                break;
        }

        in.close();
        num1.close();
        num2.close();
        
    
    }
}
