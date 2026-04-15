import java.util.Scanner;
public class pertemuan4Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Membuat program untuk menghitung total SSKM berdasarkan 
        kegiatan dan poin SSKM dari kegiatan yang diinputkan.
        Kegiatan bisa diinput hingga 5 data.

        Output : 
        Bimbingan karir : 5 poin 
        Seminar AI : 3 poin 
        Total : 8 poin 
        */

        String namaKegiatan;
        int poinSSKM = 0, total = 0;
        int i = 1;

        for (i=1; i<=5; i++) { 
            System.out.println ("Data ke : " + i);
            
            System.out.println ("Masukkan nama kegiatan " + i + " : ");
            namaKegiatan = scanner.nextLine();
            
            System.out.println ("Poin SSKM : "); 
            poinSSKM = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println();

            total = total + poinSSKM; 
        }

        System.out.println("Total poin SSKM : " + total); 

        scanner.close();
    }
}
