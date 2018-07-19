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

public class RulloKolomdanBaris {

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
        int kurangi = 0;

        System.out.println(rull.vectorX[0] + "\t");

        for (int i = 0; i < 5; i++) {
            cummulative = cummulative + rull.board[i][0];
            System.out.println("cumm : " + cummulative);  //cummulative akan digunakan untuk mencari tau angka mana yang perlu dihapus
        }
        for (int i = 0; i < 5; i++) {
            if (rull.board[i][0] > angka) {
                rull.board[i][0] = 0;
            } else {
//                System.out.println("board = " + rull.board[i][0]);

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

                    angka = rull.vectorY[0];
                    cummulative = 0;

                    for (i = 0; i < 5; i++) {
                        cummulative = cummulative + rull.board[0][i];
                        System.out.println("cumm : " + cummulative);  //cummulative akan digunakan untuk mencari tau angka mana yang perlu dihapus
                    }
                    for (i = 0; i < 5; i++) {
                        if (rull.board[0][i] > angka) {
                            rull.board[0][i] = 0;
                        } else {
//                            System.out.println("board = " + rull.board[i][0]);
//                            while (cummulative != angka) {
                                if (cummulative > angka) {
                                    for (i = 0; i < 5; i++) {
                                        if (cummulative > angka) {
                                            if (i != 4) {
                                                kurangi = cummulative - angka;
                                                System.out.println("kurangi = " + kurangi);
                                                if (rull.board[0][i] == kurangi && i != 0) {
                                                    rull.board[0][i] = 0;
                                                    cummulative = cummulative - kurangi;
                                                    System.out.println("cummulative sekarang = " + cummulative);
                                                } else {
                                                    System.out.println(rull.board[i][0] + "\t");
                                                }
                                            } else {
                                                int tes, x;
                                                for (i = 0; i < 5; i++){
                                                    if(i != 0 && i != 4){
                                                       x = i+1;
                                                        System.out.println("x koordinat = " + x);
                                                       x = rull.board[0][x];
                                                       System.out.println("x yang diisi= " + x);
                                                       tes = rull.board[0][i];
                                                       tes =  tes + x;
                                                        System.out.println("tes = " + tes);
                                                        System.out.println("kurangi = " + kurangi);
                                                       if(tes == kurangi){
                                                           x = i+1;
                                                           System.out.println("angka 1 = " + rull.board[0][x]);
                                                           System.out.println("angka 2 = " + rull.board[0][i]);
                                                           System.out.println("i = " + i);
                                                           System.out.println("x = " + x);
                                                           rull.board[0][i] = 0;
                                                           rull.board[0][x] = 0;
                                                       }
                                                    }
                                                }
                                            }
                                        }
                                    }
//                                }
                            }
                        }
                    }
                }

                System.out.print("X/Y" + "\t");
                for (i = 0; i < rull.vectorX.length; i++) {
                    System.out.print(rull.vectorX[i] + "\t");
                }
                System.out.println("");
                for (i = 0; i < rull.board.length; i++) {
                    System.out.print(rull.vectorY[i] + "\t");
                    for (int j = 0; j < rull.board.length; j++) {
                        System.out.print(rull.board[i][j] + "\t");
                    }
                    System.out.println();
                }

            }
        }
    }
}
