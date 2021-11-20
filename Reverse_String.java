import java.util.*;

public class Reverse_String{
    public void Reverse(){
        String huruf, hasil = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Sebuah Kata: ");
        huruf = scanner.nextLine();

        int jumlah = huruf.length();
        int jumlahHuruf = jumlah - 1;
        for (int i = 0; i < jumlah; i++) {
            hasil = hasil + huruf.charAt(jumlahHuruf);
            jumlahHuruf--;
        }
            System.out.println("Hasil Reverse String: " + hasil);
    }
}
