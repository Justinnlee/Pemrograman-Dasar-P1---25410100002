import java.util.Scanner;  
public class percabangan {
    public static void main(String[] args) {
        String nama;
        String buah;

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Buah apa yang disukai Atika : ");
        buah = sc.nextLine(); 

        if (buah.equals("Pisang"))
        {
            System.out.println("Horee kamu benar Atika suka Pisang");
        }
        else {
            System.out.println("Maaf Atika tidak suka" + buah);
        }   
    }
}