package Student;

public class Grade {

    private String StudentName;
    private double KoreanScore;
    private double EnglishScore;
    private double MathematicsScore;

    //Constructor
    public Grade(){

        StudentName = "EMPTY";
        KoreanScore = 0;
        EnglishScore = 0;
        MathematicsScore = 0;

    }

    public Grade(String SN , double KRS , double ENS , double MTS) {
        
        StudentName = SN;
        KoreanScore = KRS;
        EnglishScore = ENS;
        MathematicsScore = MTS;

    }

    //Getter
    public String GetStudentName(){return StudentName;}
    public double GetKrScore(){return KoreanScore;}
    public double GetEnScore(){return EnglishScore;}
    public double GetMathScore(){return MathematicsScore;}

    //Setter
    public void SetStudentName(String SN){StudentName = SN;}
    public void SetKrScore(double KRS){KoreanScore = KRS;}
    public void SetEnScore(double ENS){EnglishScore = ENS;}
    public void SetMathScore(double MTS){MathematicsScore = MTS;}
    
    //CalcFunction
    public void ShowSubAVG(){

        System.out.printf(StudentName + "의 평균 점수 : %.2f \n" , (GetKrScore() + GetEnScore() + GetMathScore()) / (double)3);
    }
}
