package TUGAS;

public class MainLingkaran {
    public static void main(String[] args) {
 
        Lingkaran lingkaran1 = new Lingkaran();
 
        lingkaran1.phi = Math.PI;
        lingkaran1.r = 7.0;
 
        double luas = lingkaran1.hitungLuas();
        System.out.println("Luas Lingkaran: " + luas);
 
        double keliling = lingkaran1.hitungKeliling();
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}
