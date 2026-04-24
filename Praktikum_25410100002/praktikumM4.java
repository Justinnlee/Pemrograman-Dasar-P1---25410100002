import java.util.Scanner;
public class praktikumM4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int batas = 0;
        System.out.println("Masukkan Bilangan Ganjil= ");
        batas = scanner.nextInt();

        int tengah = (batas / 2);
        
        if (batas % 2 != 0) {
            for (int i = 1; i<=batas; i++) {
                System.out.print(i);
            }

            System.out.println();

            for (int j = 1; j<=batas; j++) {
                for (int k = 1; k <= tengah; k++) {
                    System.out.print(" ");
                }
                System.out.println(j);

            }

            for (int i = 1; i <= batas; i++) {
                System.out.print(i);
            }
            
        } else {
            System.out.println("Bilangan Bukan Ganjil");
        }

        scanner.close();
    }
}
/* 
Nama : Justin Lee
NIM : 25410100002
*/
