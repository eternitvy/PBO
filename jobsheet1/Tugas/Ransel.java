package Tugas;

public class Ransel {
    String merek;
    String warna;

    public Ransel(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    public void isi() {
        System.out.println("Mengisi ransel merek " + merek + ", warna " + warna);
    }

    public void keluar() {
        System.out.println("Mengeluarkan isi ransel merek " + merek + ", warna " + warna);
    }

    public void info() {
        System.out.println("Ransel merek: " + merek + ", Warna: " + warna);
    }

    public void cetakInfo() {
        info();
    }
}
