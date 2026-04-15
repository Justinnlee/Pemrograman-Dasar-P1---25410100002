import java.util.Scanner;
public class mengitungIP {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in); 

     System.out.println("Masukkan Jumlah Mata Kuliah : ");
     int jumlahMataKuliah = scanner.nextInt();
     scanner.nextLine(); 
     double totalPoin = 0, nilai = 0, Hasil = 0, IPS = 0;
     String ipKumulatif = "";
     int SKS = 0, i = 1;

     for (i=1; i<=jumlahMataKuliah; i++) {
        System.out.println("Masukkan Nilai Mata Kuliah " + i + " : ");
        ipKumulatif = scanner.nextLine();

        if (ipKumulatif.equalsIgnoreCase("A")) {
            nilai = 4.0;
        } else if (ipKumulatif.equalsIgnoreCase("B+")) {
            nilai = 3.5;
        } else if (ipKumulatif.equalsIgnoreCase("B")) {
            nilai = 3.0;
        } else if (ipKumulatif.equalsIgnoreCase("C+")) {
            nilai = 2.5;
        } else if (ipKumulatif.equalsIgnoreCase("C")) {
            nilai = 2.0;
        } else if (ipKumulatif.equalsIgnoreCase("D")) {
            nilai = 1.0;
        } else if (ipKumulatif.equalsIgnoreCase("E")) {
            nilai = 0.0;
        } else {
            System.out.println("Nilai yang dimasukkan tidak valid");
            i--;
            continue;
        }

        totalPoin = totalPoin + nilai;

     }
        Hasil = totalPoin / jumlahMataKuliah;
        IPS = Math.round(Hasil * 10.0) / 10.0;

        if (IPS >= 3.5) {
            SKS = 24;
        } else if (IPS >= 3.0 && IPS < 3.5) {
            SKS = 22;
        } else if (IPS >= 2.0 && IPS < 2.99) {
            SKS = 20;
        } else {
            SKS = 18;
        }

        System.out.println("IP Semester Anda Adalah : " + IPS);
        System.out.println("Jumlah SKS yang dapat diambil : " + SKS);

        scanner.close();
    }
}
