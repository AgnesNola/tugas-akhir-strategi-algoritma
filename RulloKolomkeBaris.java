package rullo;

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
public class RulloKolomkeBaris {

    /**
     * @param args the command line arguments
     */
//    public void PecahkanKolom() {
//        RulloBoard rull = new RulloBoard();
//        int angka = rull.vectorX[0];
//        int cummulative = 0;
//        int kurangi;
//        boolean tes = true;
//        int kolom = rull.board[0][0];
//
////        for (int i = 0; i < rull.vectorX.length; i++) {
//        System.out.print(rull.vectorX[0] + "\t");
////        }
//        for (int i = 0; i <= 5; i++) {
//            cummulative = cummulative + rull.board[i][0];
//        }
//
//        while (true) {
//            for (int i = 0; i <= 5; i++) {
//                if (rull.board[i][0] > angka) {
//                    rull.board[i][0] = 0;
//                } else {
//                    while (tes == true) {
//
//                        if (cummulative > angka) {
//                            System.out.println(cummulative);
//                            kurangi = cummulative - angka;
//                            System.out.println(kurangi);
//                            for (i = 0; i <= 5; i++) {
//                                if (rull.board[i][0] == kurangi) {
//                                    rull.board[i][0] = 0;
//                                } else {
//                                    System.out.println(rull.board[i][0] + "\t");
//                                }
//                            }
//                        } else {
//                            for (i = 0; i < rull.board.length; i++) {
//                                for (int j = 0; j < rull.board.length; j++) {
//                                    System.out.print(rull.board[i][j] + "\t");
//                                    break;
//                                }
//                                System.out.println();
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
    public static void main(String[] args) {
//        RulloBoard a = new RulloBoard();
//        System.out.println();
//        System.out.print("X/Y" + "\t");
//        for (int i = 0; i < a.vectorX.length; i++) {
//            System.out.print(a.vectorX[i] + "\t");
//        }
//        System.out.println("");
//        for (int i = 0; i < a.board.length; i++) {
//            System.out.print(a.vectorY[i] + "\t");
//            for (int j = 0; j < a.board.length; j++) {
//                System.out.print(a.board[i][j] + "\t");
//            }
//            System.out.println();
//        }

        RulloBoard rull = new RulloBoard();
        int angka = rull.vectorX[0];
        int cummulative = 0;
        int kurangi;

        System.out.println(rull.vectorX[0] + "\t");

        for (int i = 0; i < 5; i++) {
            cummulative = cummulative + rull.board[i][0];
            System.out.println("cumm : " + cummulative);  //cummulative akan digunakan untuk mencari tau angka mana yang perlu dihapus
        }
        for (int i = 0; i < 5; i++) {
            if (rull.board[i][0] > angka) {
                rull.board[i][0] = 0;
            } else {
                System.out.println("board = " + rull.board[i][0]);

                if (cummulative > angka) {
                    for (i = 0; i < 5; i++) {
                        if (cummulative > angka) {
                            kurangi = cummulative - angka;
                            System.out.println("kurangi = " + kurangi);
                            if (rull.board[i][0] == kurangi && i != 5) {
                                rull.board[i][0] = 0;
                                cummulative = cummulative - kurangi;
                            } else {
                                if (i == 5) {
                                    kurangi = kurangi / 2;
                                } else {
                                    System.out.println(rull.board[i][0] + "\t");
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(rull.board[0][0] + "\t");
        System.out.println(rull.board[1][0] + "\t");
        System.out.println(rull.board[2][0] + "\t");
        System.out.println(rull.board[3][0] + "\t");
        System.out.println(rull.board[4][0] + "\t");
    }
}
