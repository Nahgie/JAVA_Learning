package MethodTest;

class NumCalc {

    private int NUM_1;
    private int NUM_2;
    
    NumCalc(){ NUM_1 = 0; NUM_2 = 0;}
    NumCalc(int a , int b) {NUM_1 = a; NUM_2 = b;}

    public int getNUM_A(){  return NUM_1;   }
    public int getNUM_B(){  return NUM_2;   }
    public void setNUM_A(int a){    NUM_1 = a;  }
    public void setNUM_B(int b){    NUM_2 = b;  }

    public int resultPlus(){ return getNUM_A() + getNUM_B(); }
    public int resultMinus(){ return getNUM_A() - getNUM_B(); }
    public int resultMultiply(){ return getNUM_A() * getNUM_B(); }
    public double resultDivide(){ return (double)getNUM_A() / (double)getNUM_B(); }
    
}