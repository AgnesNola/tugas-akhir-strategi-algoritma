/*
 * Author : alfianLyn, agnesnola, ferrentino
 * About  : This project is about solving rullo games with DFS approach
 * Other  : -.
 */
package cobarullo;

class RulloBoard {

    int[][] board = {
        {2, 3, 3, 2, 2},
        {4, 3, 3, 3, 4},
        {2, 3, 4, 4, 2},
        {3, 3, 4, 3, 4},
        {2, 3, 4, 4, 4}
    };
    int[] vectorX = {9, 6, 11, 12, 8};
    int[] vectorY = {7, 10, 5, 10, 14};

    
}

/**
 *
 * @author Aiden
 */
public class CobaRullo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RulloBoard a = new RulloBoard();
        System.out.println();
        System.out.print("X/Y" + "\t");
        for (int i = 0; i < a.vectorX.length; i++) {
            System.out.print(a.vectorX[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < a.board.length; i++) {
            System.out.print(a.vectorY[i] + "\t");
            for (int j = 0; j < a.board.length; j++) {
                System.out.print(a.board[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
