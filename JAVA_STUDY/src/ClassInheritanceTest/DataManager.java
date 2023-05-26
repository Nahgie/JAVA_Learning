package ClassInheritanceTest;

class BaseDataStruct{
    private String CustomerName;
    private String CustomerPhoneNumber;

    //Getter
    public String GetCustomerName() {return CustomerName;}
    public String GetCustomerPhoneNumber(){return CustomerPhoneNumber;}
    //Setter
    public void SetCustomerName(String CN){CustomerName = CN;}
    public void SetCustomerPhoneNumber(String CPN) {CustomerPhoneNumber = CPN;}

}

class DataManager extends BaseDataStruct {

    private String CustomerMail;
    private byte CustomerAge;
    private boolean CustomerSex;

    DataManager(){
        this.SetCustomerName("Empty");
        this.SetCustomerPhoneNumber("010-0000-0000");
        CustomerMail = "Empty";
        CustomerAge = 0;
        CustomerSex = false;
    }
    
    DataManager(String CN , String CPN , String CM , byte CA , boolean CS){
        this.SetCustomerName(CN);
        this.SetCustomerPhoneNumber(CPN);
        CustomerMail = CM;
        CustomerAge = CA;
        CustomerSex = CS;
    }

    //Getter
    public String GetCustomerMail() {return CustomerMail;}
    public Byte GetCustomerAge() {return CustomerAge;}

    public String GetCustomerSex (){
        if(CustomerSex == false){ 

              return "남성";  

        } else {    

            return "여성";    

        }

    }

    //Setter
    public void SetCustomerMail(String CM) { CustomerMail = CM;}
    public void SetCusomerAge(byte CA) {CustomerAge = CA;}
    public void SetCusomerSex(boolean CS) {CustomerSex = CS;}

}
