//1. import class scanner
import java.util.Scanner; 
public class latihanScanner {
    public static void main(String[] args) {
        //2. deklarasi scanner
        Scanner scanner = new Scanner(System.in); 

        /*Praktik: 
        Jacob ingin belanja beberapa kebutuhan bahan pokok di Alfamart. 
        Sebagai kasir, ada beberapa data yang harus dimasukkan ke dalam program dari belanjaan Jacob. 
        Data - data tersebut adalah : 
        Nama Barang >> String
        Jumlah Barang >> int 
        Harga Barang >> int
        Total Barang >> int 
        Biaya PPN >> double >> casting/konversi tipe data (dijadikan integer saja biar bisa dihitung)
        Tanggal Pembelian >> String 
        Kembalian >> int
        */
        
        //3. deklarasi variabel
        String namaBarang = "";
        int jumlahBarang = 0, hargaBarang = 0, totalBarang = 0;

        //4. input 
        System.out.print("Input Nama Barang : "); //untuk disebelah titik dua
        namaBarang = scanner.nextLine();
        //nextLine () untuk string 

        System.out.print("Input Jumlah Barang : ");
        jumlahBarang = scanner.nextInt();

        System.out.print("Input Harga Barang");
        hargaBarang = scanner.nextInt();
        
        //5. Output
        totalBarang = hargaBarang * jumlahBarang;
        System.out.print("Total Barang : " + totalBarang);

        //6. Close Scanner
        scanner.close();
        
    }
}
