//blok class 
public class latihan1 {
    //blok main
    public static void main(String[] args) {
        //tempat koding 

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

        //deklarasi variabel 
        String namaBarang = "Sukro";
        int jumlahBarang = 2;
        int hargaBarang = 3000;
        int totalBarang = hargaBarang * jumlahBarang;
        int biayaPPN;  
        String tanggalPembelian;
        int kembalian ;

        //print/cetak >> shortcut : sout + tab
        //prnt variabel tanpa teks tambahan :
        System.out.println(totalBarang);

        //Print variabel dengan teks tambahan : 
        System.out.println("Nama Barang :" + namaBarang);

        //Print variabel dengan teks tambahan lebih dari 1 : 
        System.out.println("Nama Barang :" + namaBarang + "Jumlah Barang :" + jumlahBarang);

        //Print dengan karakter escape \n >> new line
        System.out.println(namaBarang + "\n" + totalBarang);
        
        
    }
}
    