package ta_sa_coba;

import java.util.Random;

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

    boolean next;

    RulloBoard() {

    }

    RulloBoard(int[][] board, int[] vectorX, int[] vectorY) {
        this.board = board;
        this.vectorX = vectorX;
        this.vectorY = vectorY;
        next = false;
    }
    
    public void hitung_baris(int a, int b, int c, int d, int e, int jumlah){
        Random random=new Random();
        int[] x = null; 
        int count;
        boolean y=false;
        boolean z[] = null;
        x[0]=a;
        x[1]=b;
        x[2]=c;
        x[3]=d;
        x[4]=e;
        
        do{
            for(count=0; count<5; count++){
                int r=(Math.random()<0.5)?0:1;
                if(r==0){
                    z[count]=false;
                }
                if(z[count]==false){
                    x[count]=0;
                }
            }
            if(jumlah==x[0]+x[1]+x[2]+x[3]+x[4]){
                y=true;
            }
        }while(y==true);
        System.out.println(x[0]+","+x[1]+", "+x[2]+", "+x[3]+", "+x[4]);
    }
}


public class TA_SA_Coba {
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
        
        a.hitung_baris(a.board[0][0], a.board[0][1], a.board[0][2], a.board[0][3], a.board[0][4], a.vectorY[0]);
    }
}