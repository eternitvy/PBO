import java.util.Scanner;

public class TampilPersegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = sc.nextInt();
        Persegi persegi = new Persegi(sisi);

        System.out.println("\n--- DATA PERSEGI ---\n");
        persegi.tampilDataPersegi();
        System.out.println("Nilai luas persegi: " + persegi.luasPersegi());
        System.out.println("Nilai keliling persegi: " + persegi.kelilingPersegi());
    }
}
