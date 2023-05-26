package ClassInheritanceTest;

import java.util.Scanner;

public class CustomerManagementSystem {

    public static void main(String[] args) throws Exception {

        Scanner In_Data = new Scanner(System.in);
        DataManager DM = new DataManager();

        System.out.print("이름을 입력하세요 : ");
        String CN = In_Data.next();
        DM.SetCustomerName(CN);

        System.out.print("이메일을 입력하세요 : ");
        String CM = In_Data.next();
        DM.SetCustomerMail(CM);

        System.out.print("전화번호를 입력하세요 : ");
        String CPN = In_Data.next();
        DM.SetCustomerPhoneNumber(CPN);

        System.out.print("나이를 입력하세요 [12세 부터 ~ 60세 까지] : ");
        byte CA = In_Data.nextByte();
        CustomerAgeDataCheck(DM, CA);

        System.out.print("성별을 입력하세요 [\'M\'AN or \'F\'emale]: ");
        String CS = In_Data.next();
        CustomerSexDataCheck(DM, CS);
        

        ShowCustomerData(DM);

        In_Data.close();

    }

    static void CustomerAgeDataCheck(DataManager DM , byte CA) {

        if (CA > 12 && CA < 70) {
            
            DM.SetCusomerAge(CA);

        } else {
            
            System.out.println("허용되지 않는 나이 유형입니다.");
            System.exit(0);

        }

    }

    static void CustomerSexDataCheck( DataManager DM , String CS){

        if (CS.equals("Man") || CS.equals("man") || CS.equals("M") || CS.equals("m")) {
            
            DM.SetCusomerSex(false);

        } else if (CS.equals("Female") || CS.equals("female") || CS.equals("F") || CS.equals("f")) {

            DM.SetCusomerSex(true);

        } else {
            
            System.out.println("허용되지 않는 성별 유형입니다.");
            System.exit(0);

        }

    }

    static void ShowCustomerData(DataManager DM){

        System.out.println("\n=====================(고객정보)=====================");
        System.out.println("\n고객 성함 : " + DM.GetCustomerName() + "\n전화번호 : " + DM.GetCustomerPhoneNumber() + "\n이메일 : " + DM.GetCustomerMail() + "\n나이 : " + DM.GetCustomerAge() + "\n성별 : " + DM.GetCustomerSex() + "\n");

    }

}
