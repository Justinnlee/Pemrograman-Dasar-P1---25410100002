import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class praktikum1 {
    public static void main(String[] args) throws IOException {
        float angka1 = 5;
        float angka2 = 2;
        float hasil;

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        //Inputan 
        System.out.print("Angka 1 = ");
        angka1 = Float.parseFloat(br.readLine());
        
        System.out.print("Angka 2 = ");
        angka2 = Float.parseFloat (br.readLine());

        //proses
        hasil = angka1/angka2;

        //output
        System.out.println("Hasil = " + hasil);
        
    }
    
}
