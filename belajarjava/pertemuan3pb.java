import java.util.Scanner;
public class pertemuan3pb {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input pesanan : namaPemesan, noMeja, total
        //input jumlah jenisPesanan : (dine in/take away)
        String namaPemesan= "";
        String noMeja = "", jenisPesanan = "";
        int jumlahPesanan = 0, total = 0, harga = 0;

        System.out.print("Nama Pemesan : ");
        namaPemesan = scanner.nextLine();
        System.out.println("Menu Mie Wacoan");
        System.out.println("1. Mie Wacoan");
        System.out.println("2. Mie Hompimpa");
        System.out.println("3. Mie Suit");
        System.out.println("4. Dimsum");
        System.out.println("5. Minuman");
        System.out.println("Pilih Menu");
        int pilih = scanner.nextInt();
        //cek kondisi dengan integer 
        scanner.nextLine();

        if (pilih ==1 || pilih ==2) {
            System.out.println("Pilih Level (1-8): ");
            String level = scanner.nextLine (); 
            harga = 13000;
            System.out.println("Jumlah Pesan : ");
            jumlahPesanan = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Nama Pesanan : ");
            String pesanan = scanner.nextLine ();
        }

        System.out.print("Jenis Pesanan : \n 1. Dine In \n 2. Take Away" + "\n");
        jenisPesanan = scanner.nextLine();
        //cek string
        //equals = case sensitive (memperhatikan besar/kecil huruf)
        //equalgnoreCase : case non sensitive (kebalikan dari equals) 
        if (jenisPesanan.equalsIgnoreCase ("dine in")) {
            System.out.print ("no meja : ");
            noMeja = scanner.nextLine (); 
            total = harga*jumlahPesanan;
            System.out.println("total : " + total);
            //pesanan
        } else {
            System.out.println("Take away");
            total = (harga*jumlahPesanan) + 2000;
            System.out.println("total : " +total);
            //Pesanan
        }


    
        scanner.close ();
    }
    
}
