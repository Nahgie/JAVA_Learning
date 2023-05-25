package BranchTest;

public class BranchTest_1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        if (a >= b) {
        
            System.out.println(a + " (은)는 " + b + " 보다 크거나 같습니다.");
        
        } else if (a <= b) {
            
            System.out.println(a + " (은)는 " + b + " 보다 작거나 같습니다.");

        } else if (a < b) {

            System.out.println(a + " (은)는 " + b + " 보다 작습니다.");

        } else if (a > b) {

            System.out.println(a + " (은)는 " + b + " 보다 큽니다.");

        } else {

            System.out.println(a + " 와 " + b + " 는 같습니다.");

        }
    }
}
