import java.util.Scanner;
public class Tugas1Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Deklarasi 
        int nominal = 0, duaPuluhRibuan = 0, sepuluhRibuan = 0, seribuan = 0, limaRatusan = 0, duaRatusan = 0, seratusan = 0, sisa = 0; 

        //Input
        System.out.println("Masukkan Nominal = ");
        nominal = scanner.nextInt();

        //Proses
        duaPuluhRibuan = nominal / 20000;
        sisa = nominal % 20000; 

        sepuluhRibuan = sisa / 10000;
        sisa = sisa % 10000;

        seribuan = sisa / 1000;
        sisa = sisa % 1000; 

        limaRatusan = sisa / 500;
        sisa = sisa % 500;

        duaRatusan = sisa / 200;
        sisa = sisa % 200;

        seratusan = sisa / 100;
        sisa = sisa % 100;

        //Output 
        System.out.println("Jumlah Dua Puluh Ribuan = "+duaPuluhRibuan);
        System.out.println("Jumlah Sepuluh Ribuan = "+sepuluhRibuan);
        System.out.println("Jumlah Seribuan = "+seribuan);
        System.out.println("Jumlah Lima Ratusan = "+limaRatusan);
        System.out.println("Jumlah Dua Ratusan = "+duaRatusan);
        System.out.println("Jumlah Seratusan = "+seratusan);

        scanner.close();
    }
    
}
