import Member.Member;

public class StudentDataManager {
    public static void main(String[] args) throws Exception {
        
        Member StudentData = new Member("12345","abcde","서울특별시 강남구 역삼동","student@school.com");
        StudentData.Result();

        StudentData = new Member();
        StudentData.Result();
        
    }
}
