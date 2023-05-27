package Member;

public class Member {
    private String MemberID;
    private String MemberPW;
    private String MemberADRS;
    private String MemberMail;

    //Constructor
    public Member(){
    
        MemberID = "Empty";
        MemberPW = "None";
        MemberADRS = "None";
        MemberMail = "None";
    
    }

    public Member(String ID , String PW, String ADRS , String MAIL){

        MemberID = ID;
        MemberPW = PW;
        MemberADRS = ADRS;
        MemberMail = MAIL;

    }

    //Getter
    public String GetMID() {return MemberID;}
    public String GetMPW() {return MemberPW;}
    public String GetMADRS() {return MemberADRS;}
    public String GetMMAIL() {return MemberMail;}

    //Setter
    public void SetMID(String ID) { MemberID = ID;}
    public void SetMPW(String PW) { MemberPW = PW;}
    public void SetMADRS(String ADRS) { MemberADRS = ADRS;}
    public void SetMMAIL(String MAIL) { MemberMail = MAIL;}

    //DataVisibleFunction
    public void Result(){

        System.out.println("학생정보" + "\n----------------------");
        System.out.println("ID : " + GetMID() + "\nPW : " + GetMPW() + "\nAddress : " + GetMADRS() + "\nEmail : " + GetMMAIL() + "\n");

    }

}
