package Tugas;

public class Hoodie {
    String warna;
    String bahan;

    public Hoodie(String warna, String bahan) {
        this.warna = warna;
        this.bahan = bahan;
    }

    public void pakai() {
        System.out.println("Memakai hoodie warna " + warna);
    }

    public void cuci() {
        System.out.println("Mencuci hoodie berbahan " + bahan);
    }

    public void info() {
        System.out.println("Hoodie warna: " + warna + ", bahan: " + bahan);
    }

    public void cetakInfo() {
        info();
    }
}
