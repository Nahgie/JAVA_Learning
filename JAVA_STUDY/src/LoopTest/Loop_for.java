package LoopTest;

import java.util.Scanner;

public class Loop_for {
    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(System.in);
        int cc = in.nextInt();
        
        for(int i = 0 ; i < cc ; i++){
            for(int j = 0  ; j <= i ; j++){
            
                System.out.print("*");
            
            }

            System.out.println("");
        }

        in.close();
    }
}
