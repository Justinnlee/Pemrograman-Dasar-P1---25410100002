import java.util.Scanner;
public class praktikumM5 {
    public static void main(String[] args) {
        int batas = 0, kelipatan = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kelipatan : ");
        kelipatan = scanner.nextInt();

        System.out.print("Masukkan batas : ");
        batas = scanner.nextInt();

        for (int x = 1; x < batas; x = x +kelipatan) {
            System.out.print(x + " ");
        }
        System.out.println("");
        scanner.close();
    }
}
/* Nama : Justin Lee 
NIM : 25410100002
*/