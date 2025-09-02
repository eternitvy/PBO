package Tugas;
public class ElektronikDanPakaian {
    Hoodie hoodie;
    Laptop laptop;

    public ElektronikDanPakaian(Hoodie hoodie, Laptop laptop) {
        this.hoodie = hoodie;
        this.laptop = laptop;
    }

    public void pakaiHoodie() {
        hoodie.pakai();
    }

    public void nyalakanLaptop() {
        laptop.nyalakan();
    }

    public void info() {
        System.out.println("\n--- Informasi Barang Elektronik dan Pakaian ---");
        hoodie.info();
        laptop.info();
    }

    public void cetakInfo() {
        info();
    }
}
