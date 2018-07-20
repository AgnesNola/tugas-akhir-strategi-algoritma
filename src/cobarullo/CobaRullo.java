/*
 * Author : alfianLyn, agnesnola, ferrentino
 * About  : This project is about solving rullo games with DFS approach
 * Other  : -.
 */
package cobarullo;

import java.util.Stack;

class RulloBoard {

    int[] tmp = new int[99];
    Stack temp = new Stack();
    int count = 0, cnt = 0;
    int[][] board = {
        {2, 3, 3, 2, 2},
        {4, 3, 3, 3, 4},
        {2, 3, 4, 4, 2},
        {3, 3, 4, 3, 4},
        {2, 3, 4, 4, 4}
    };
    int[] vectorX = {9, 6, 11, 12, 8};
    int[] vectorY = {7, 10, 5, 10, 14};
    boolean benar = false;

    void solve() {

        int valueX = 0, valueY = 0;
        for (int i = 0; i < board.length; i++) {
            count = 0;
            do {
                cnt = count;
                for (int j = 0; j < board.length; j++) {
                    for (int k = j; k <= cnt; k++) {
                        if (k == 5) {
                            temp.push(board[i][0]);
                            board[i][0] = 0;
                            break;
                        }
                        temp.push(board[i][k]);
                        board[i][k] = 0;
                    }
                    int hasil = 0;
                    for (int k = 0; k < board.length; k++) {
                        hasil += board[i][k];
                    }
                    System.out.println(hasil);
                    if (hasil == vectorY[i]) {
                        benar = true;
                        break;
                    } else {
                        for (int k = cnt; k >= j; k--) {
                            if (k == 5) {
                                board[i][0] = (int) temp.pop();
                            } else {
                                board[i][k] = (int) temp.pop();
                            }
                        }
                        benar = false;
                    }
                    cnt++;
                }
                count++;
            } while (!benar);
            System.out.println();
        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < 5; k++) {
//                    for (int l = 0; l < 5; l++) {
//                        if (k == l) {
//                            //System.out.println(i + ", " + board[i][k]);
//                            // pushTmp(board[i][k]);
//                            continue;
//                        } else {
//                            System.out.println(l);
//                            valueX += board[i][k];
//                        }
//                        if (valueX == vectorX[i]) {
//                            break;
//                        }
//                    }
//                    if (valueX == vectorX[i]) {
//                        break;
//                    }
//
//                    valueX = 0;
//                    count++;
//                }
//            }
//        }
    }

    int pushTmp(int a) {
        return tmp[count] = a;
    }

    void showTmp() {
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] != 0) {
                System.out.println(i + ", " + tmp[i]);
            }
        }
    }
}

/**
 *
 * @author Aiden
 */
public class CobaRullo {

    static RulloBoard a = new RulloBoard();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        a.solve();
        tampil_board();
//        a.showTmp();

    }

    static void tampil_board() {
        // RulloBoard a = new RulloBoard();
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
