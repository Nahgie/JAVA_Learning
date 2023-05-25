package PrintTest;

public class PrintTest {
    public static void main(String[] args) {

        byte a = 65; // 1바이트
        short b = 65; // 2바이트
        int c = 65; // 4바이트
        long d = 65; // 8바이트
        float e = 65.0F; // 4바이트
        double f = 65.0; // 8바이트
        char g = 'A'; // 2바이트
        boolean h = true; // 1바이트 (표현은 1비트로 되나 현대의 CPU의 구조로는 1비트로 처리 할 경우 성능하락과 여러 이슈가 있음)

        System.out.println((char)a + " " + (char)b + " " + (char)c + " " + (char)d + " " + (char)e + " " + (char)f + " " + g + " " + h);

    }
}