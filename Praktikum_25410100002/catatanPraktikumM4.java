import java.util.Scanner;
public class catatanPraktikumM4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int batas = 0;
        System.out.print("Masukkan Batasan Bilangan =  ");
        batas = scanner.nextInt();

        for (int a=1;a<=batas;a++) 
        {
            if (a % 2 != 0)
            System.out.println(a);
            System.out.print(" ");
        }
    }
}
