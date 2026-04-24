import java.util.Scanner;
public class quizPemrogramanDasar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namaPasien = "";
        String kondisiPasien = "";
        int usiaPasien = 0, tekananDarahSistolik = 0, tekananDarahDistolik = 0;

        System.out.println("Masukkan Usia Pasien;");
        usiaPasien = scanner.nextInt();

        do {
            System.out.println("Masukkan tekanan darah sistolik pasien:");
            tekananDarahSistolik = scanner.nextInt();
            System.out.println("Masukkan tekanan darah distolik pasien;");
            tekananDarahDistolik = scanner.nextInt();

            if (usiaPasien <=6 && usiaPasien >=12) {
                if (tekananDarahSistolik <=90 && tekananDarahSistolik <=120 && tekananDarahDistolik <=57 && tekananDarahDistolik <=80) {
                    kondisiPasien = "Normal";
                } else {
                    kondisiPasien = "Tidak Normal"; 
                }
                
            } else if (usiaPasien >=12 && usiaPasien <=18) { 
                if (tekananDarahSistolik <=110 && tekananDarahSistolik <=130 && tekananDarahDistolik >=60 && tekananDarahDistolik <=80) {
                    kondisiPasien = "Normal";
                } else {
                    kondisiPasien = "Tidak Normal";
                }
            } else if (usiaPasien >=18 && usiaPasien <=60) {
                if (tekananDarahSistolik <=120 && tekananDarahSistolik <=140 && tekananDarahDistolik >=60 && tekananDarahDistolik <=80) {
                    kondisiPasien = "Normal";
                } else {
                    kondisiPasien = "Tidak Normal";
                }
            } else if (usiaPasien >=60) {
                if (tekananDarahSistolik <=140 && tekananDarahSistolik <=180 && tekananDarahDistolik >=80 && tekananDarahDistolik <=90) {
                    kondisiPasien = "Normal";
                } else {
                    kondisiPasien = "Tidak Normal";
                }
            }
            if (kondisiPasien.equalsIgnoreCase("Normal")) {
                System.out.println("Tekanan Darah Pasien Normal");
            } else {
                System.out.println ("Tekanan Darah Pasien Tidak Normal, Silahkan Periksa Kembali");
            }
        } while (kondisiPasien.equalsIgnoreCase ("Tidak Normal"));

        scanner.close();
    }
}
