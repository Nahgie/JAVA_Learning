package MethodTest;

import java.util.Scanner;

public class EncapsulationTest {
    public static void main(String[] args){

        NumCalc Mymethod = new NumCalc();

        Scanner in = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하세요.");
        int Num1 = in.nextInt();
        
        System.out.println("두 번째 정수를 입력하세요.");
        int Num2 = in.nextInt();

        System.out.println("계산모드를 고르세요 [ 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈]");
        int Mode = in.nextInt();


        Mymethod.setNUM_A(Num1);
        Mymethod.setNUM_B(Num2);

        switch(Mode){

            case 1:
            System.out.println(Mymethod.resultPlus());
            break;

            case 2:
            System.out.println(Mymethod.resultMinus());
            break;

            case 3:
            System.out.println(Mymethod.resultMultiply());
            break;

            case 4:
            System.out.println(Mymethod.resultDivide());
            break;

            default:
            System.out.println("잘못된 요청입니다.");
            System.exit(0);
            break;
        }

        in.close();

    }
}
