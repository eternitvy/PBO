package TUGAS;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        float hargaJualFloat = hargaDasar - (diskon / 100 * hargaDasar);
        return (int) hargaJualFloat;
    }

    public void tampilData() {
        System.out.println("------------------------------------");
        System.out.println("Data Barang");
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Dasar  : Rp" + hargaDasar);
        System.out.println("Diskon       : " + diskon + " %");
        System.out.println("Harga Jual   : Rp" + hitungHargaJual());
        System.out.println("------------------------------------");
    }
}
