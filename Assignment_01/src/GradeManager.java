import Student.Grade;

public class GradeManager {
    public static void main(String[] args) throws Exception {

        Grade STDT_KANG = new Grade("강백호", 90.0, 85.5, 70.0);
        Grade STDT_CHAE = new Grade("채치수", 82.0, 92.0, 60.5);

        STDT_KANG.ShowSubAVG();
        STDT_CHAE.ShowSubAVG();

    }
}
