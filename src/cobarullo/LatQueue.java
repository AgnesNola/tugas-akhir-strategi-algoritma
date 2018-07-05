package pkg09.pkg10.pkg2017.pkg1;

public class LatQueue {
    public static void main(String[] args) {
        LatQueue a = new LatQueue();
//        a.inisialisasi(5);
//        a.display();
//        a.push(1);
//        a.pop();
//        a.push(5);
//        a.push(9);
//        a.push(7);
//        a.pop();
//        a.find(7);
//        a.display();
       a.inisialisasi(12);
       a.push(8);
       a.push(5);
       a.push(8);
       a.push(8);
       a.pop();
       a.find(7);
       a.push(2);
       a.pop();
       a.push(6);
       a.push(6);
       a.pop();
       a.pop();
       a.pop();
       a.push(4);
       a.find(7);
       a.push(2);
       a.push(6);
       a.push(6);
       a.display();
    }

    static int[] queue;
    static int ukuran,top;
    
    static void inisialisasi(int i){
        ukuran = i;
        queue = new int[ukuran];
        top = 0;
    }
    
    static boolean isempty(){
        return top <= 0;
    }
    
    static boolean isfull(){
        return top >= ukuran;
    }
    
    static void push(int i){
        if(isfull()){
            System.out.println("Maaf Antrean penuh");
        } else {
            System.out.println("Nilai : " + i + " masuk antrean");
            queue[top++]=i;
        }
    }
    
    static void pop(){
        if (isempty()){
            System.out.println("Maaf antrean kosong");
        } else {
            int pop = queue[0];
            int i = 1;
            System.out.println("Nilai : " + pop + " keluar antrean");
            while(i<top){
                queue[i-1] = queue[i];
                i++;
            }
            top--;
        }
    }
    
    static void find(int i){
        boolean hasil = false;
        int temp = 0;
        while(temp < top){
            if (i == queue[temp]){
                hasil = true;
                break;
            }
            temp++;
        }
        if (hasil){
            System.out.println("Nilai : " + i + " ditemukan di antrian ke " + (temp + 1));
        } else {
            System.out.println("Nilai tidak ditemukan");
        }
    }
    
    static void display() {
        System.out.println("Isi antrean");
        int i = 0;
        while (i < top){
            System.out.println("Antrean ke [" + (i+1) + "] " + queue[i]);
            i++;
        }
    }
    
}
