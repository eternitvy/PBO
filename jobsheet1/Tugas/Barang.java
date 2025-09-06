package Tugas;

public class Barang {
    String nama;
    String merek;

    public Barang(String nama, String merek) {
        this.nama = nama;
        this.merek = merek;
    }

    public void cetakInformasi() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Merek: " + this.merek);
    }

    public void statuBarang() {
        System.out.println("Status barang tidak diketahui.");
    }

    public void deskripsiBarang() {
        System.out.println("Deskripsi umum barang.");
    }
}