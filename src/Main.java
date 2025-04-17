import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 3 X 3 BOARD
        char[][] rows = {  // rows: char[3] []@942
                {'.' ,'.' ,'.' }  , // row 0
                {'.' ,'.' ,'.' }  , // row 1
                {'.' ,'.' ,'.' }  , // row 2
                //0    1    2   positions in a row
        } ;
        rows[1][1] = 'X' ;

        //DISPLAY THE WHOLE BOARD
        for (int r = 0; r < rows.length; r++) {
            for (int c = 0; c < rows[r].length; c++) {
                System.out.print(rows [r][c]);
                System.out.print(' ');
            }
            System.out.print("\n"); // new line
        }
    }
}