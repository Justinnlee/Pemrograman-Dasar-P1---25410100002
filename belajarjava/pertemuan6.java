import java.util.Scanner;
public class pertemuan6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 

        //deklarasi variabel
        String [] kategori = new String[0];
        int [] Harga = new int[0];
        int [] jumlahTiket = new int[0];
        int total = 0, Menu = 0, jumlahData = 0;
       //menu 
       do {
        System.out.println("Pemesanan Tiket Surabaya Zoo ");
        System.out.println("1. Input kategori dan Harga");
        System.out.println("2. Input Jumlah Beli");
        System.out.println("3. Hitung Total");
        System.out.println("4. Keluar Program");
        System.out.println("Pilih Menu : ");
        Menu = scanner.nextInt();

        //Percabangan Menu 
        switch (Menu) {
            case 1:
                //menu1 >> isian data bebas sesuai user
            System.out.print("Berapa Jumlah data : ");
            jumlahData = scanner.nextInt();

            //deklarasi ulang array nya 
            kategori = new String[jumlahData];
            Harga = new int[jumlahData];
            jumlahTiket = new int[jumlahData];
            scanner.nextLine();

            //input dan output array menggunakan loop
            //indeks array harus dimulai dari 0
            for (int i = 0; i < kategori.length; i++) {
                System.out.print("Input kategori ke -  " + (i+1) + " : ");
                kategori [i] = scanner.nextLine();
                System.out.print("Input harga : ");
                Harga [i] = scanner.nextInt();
                scanner.nextLine();
                System.out.println(); //baris kosong
            }

            //output 
            for (int i = 0; i < Harga.length; i++) {
                System.out.println("kategori ke -" + (i+1) + " :" + kategori[i]);
            }
            break;
            
            case 2:
                //menu2
                //deklarasi array
                jumlahTiket = new int[jumlahData];

                for (int i = 0; i < jumlahData; i++) {
                    System.out.print("Input Jumlah Beli ke - " + (i+1) + " : ");
                    jumlahTiket [i] = scanner.nextInt();
                }
            break;

            case 3:
                //menu3 
                for (int i = 0; i < jumlahData; i++) {
                    total += Harga[i] * jumlahTiket[i];
                }
                System.out.println("Total Harga : " + total);
            break;

            case 4: 
                //menu4
                System.out.println("Keluar Program");
                scanner.close();
                System.exit(0);
            break;
        }
       } while (true);
    }
}
