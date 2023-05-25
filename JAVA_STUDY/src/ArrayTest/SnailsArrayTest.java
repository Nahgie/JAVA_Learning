package ArrayTest;

import java.lang.reflect.Array;

public class SnailsArrayTest {
    public static void main(String[] args) throws Exception{
        int[][] snailsHouse = new int[5][5];

        int Loop = 5;
        int Temp = 1;
        int T_Line = 1;
        int VT_Line = -1;
        int BT_Line = 0;

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < Loop; j++) {
                VT_Line += T_Line;
                snailsHouse[BT_Line][VT_Line] = Temp;
                Temp++;
            }

            Loop--;

            for (int j = 0; j < Loop; j++) {
                BT_Line += T_Line;
                snailsHouse[BT_Line][VT_Line] = Temp;
                Temp++;
            }
            T_Line = T_Line * -1;
        }

        for (int i = 0; i < Array.getLength(snailsHouse); i++) {
            for (int j = 0; j < Array.getLength(snailsHouse); j++) {
                System.out.print(" " + snailsHouse[i][j]);
            }
            System.out.println();
        }
    }
}
