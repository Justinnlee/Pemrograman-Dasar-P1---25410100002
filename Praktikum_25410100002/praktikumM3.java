import java.util.Scanner;
public class praktikumM3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int jumlahPeserta = 0, bus = 0, minibus = 0, mobil = 0, sisa = 0;

        System.out.print("Masukkan Jumlah Penumpang");
        jumlahPeserta = scanner.nextInt();

        bus = jumlahPeserta / 50;
        sisa = jumlahPeserta % 50;

        minibus = sisa / 15;
        sisa = sisa & 15;

        mobil = sisa / 7;
        sisa = sisa % 7;

         if (sisa!= 0) {
            mobil = mobil +1;
        }
        System.out.println("Jumlah bus " + bus + ", Jumlah miniBus = " + minibus + ", Jumlah Mobil = " + mobil + ".");
        scanner.close();
    }
}

/* Nama : Justin Lee 
NIM : 25410100002
*/