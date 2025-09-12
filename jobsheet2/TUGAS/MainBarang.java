package TUGAS;

public class MainBarang {
    public static void main(String[] args) {
        Barang barang1 = new Barang();

        barang1.kode = "A001";
        barang1.namaBarang = "Laptop XYZ";
        barang1.hargaDasar = 10000000;
        barang1.diskon = 10;

        barang1.tampilData();

        Barang barang2 = new Barang();
        barang2.kode = "B002";
        barang2.namaBarang = "Mouse Gaming";
        barang2.hargaDasar = 500000;
        barang2.diskon = 5; 

        barang2.tampilData();
    }
}
