import java.util.Scanner;

public class RangeNumPlus {
    public static void main(String[] args) throws Exception {

        Scanner In_data = new Scanner(System.in);

        System.out.print("숫자입력 : ");
        int NumMax = In_data.nextInt();
        DataInvalidChk(0, NumMax, In_data);

        System.out.print("숫자입력 : ");
        int NumMin = In_data.nextInt();
        DataInvalidChk(NumMin, NumMax, In_data);
        int sum = 0;

        System.out.print("결과 :");
        
        for (int i = NumMin; i <= NumMax; i++) {

            System.out.print(" " + i);
            sum += i;
            if (i < NumMax) {   System.out.print(",");  }

        }

        System.out.println("\n합계 : " + sum);
        In_data.close();

    }

    static void DataInvalidChk(int NumMin , int NumMax , Scanner D_type){

        try {
            if (NumMin < 0 || NumMin >= 2147483647) {

                D_type.close();
                throw new Exception();

            } else if (NumMax < 0 || NumMax >= 2147483647) {

                D_type.close();
                throw new Exception();

            } else if (NumMin == NumMax) {

                D_type.close();
                throw new Exception();

            }

        } catch (Exception e) {
            System.out.println("허용되는 값이 아닙니다.");
            System.exit(0);
        }

    }
}
