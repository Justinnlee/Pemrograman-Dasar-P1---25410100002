import java.util.Scanner;
public class latihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kondisiPasien = "";
        int tekananDarahSistolik = 0, usiaPasien = 0, tekananDarahDistolik = 0;

        System.out.println("Masukkan usia pasien: ");
            usiaPasien = scanner.nextInt();

        do {
            System.out.println("Masukkan tekanan darah sistolik: ");
            tekananDarahSistolik = scanner.nextInt();
            System.out.println("Masukkan tekanan darah distolik: ");
            tekananDarahDistolik = scanner.nextInt();
        

            if (usiaPasien >= 6 && usiaPasien <= 12) {
                if (tekananDarahSistolik >= 90 && tekananDarahSistolik <= 120 && tekananDarahDistolik >= 57 && tekananDarahDistolik <= 80) {
                    kondisiPasien = "Normal";
                } else {
                    kondisiPasien = "Tidak Normal";
                }
            } else if (usiaPasien >= 12 && usiaPasien < 18) {
                if (tekananDarahSistolik >= 110 && tekananDarahSistolik <= 130 && tekananDarahDistolik >= 60 && tekananDarahDistolik <= 80) {
                    kondisiPasien = "Normal";
                } else {
                    kondisiPasien = "Tidak Normal";
                }
            } else if (usiaPasien >= 18 && usiaPasien < 60) {
                if (tekananDarahSistolik >= 120 && tekananDarahSistolik <= 80 && tekananDarahDistolik >= 60 && tekananDarahDistolik <= 80) {
                    kondisiPasien = "Normal";
                } else {
                    kondisiPasien = "Tidak Normal";
                }
            } else if (usiaPasien >= 60) {
                if (tekananDarahSistolik >= 140 && tekananDarahSistolik <= 90 && tekananDarahDistolik >=80 && tekananDarahDistolik <=90) {
                    kondisiPasien = "Normal";
                } else {
                    kondisiPasien = "Tidak Normal";
                }
                
            } 
            if (kondisiPasien.equalsIgnoreCase ("Normal")) {
                System.out.println("Kondisi Pasien Normal");
            } else {
                System.out.println("Kondisi Pasien Tidak Normal Silahkan Cek Kembali");
            }
            
        } while (kondisiPasien.equalsIgnoreCase("Tidak Normal"));

        scanner.close();
    }
    
}