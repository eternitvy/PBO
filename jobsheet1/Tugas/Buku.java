package Tugas;

public class Buku {
    String judul;
    String penerbit;
    int jmlhalaman;

    public Buku(String judul, String penerbit, int jmlhalaman) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.jmlhalaman = jmlhalaman;
    }

    public void baca() {
        System.out.println("Membaca buku: " + judul);
    }

    public void info() {
        System.out.println("Buku: " + judul + ", Penerbit: " + penerbit +  ", Jumlah Halaman: " + jmlhalaman);
    }

    public void cetakInfo() {
        info();
    }
}
