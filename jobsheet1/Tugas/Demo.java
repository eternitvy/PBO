package Tugas;

public class Demo {
    public static void main(String[] args) {
        Buku buku = new Buku("Hujan", "Tere Liye", "978-602-032-478-4", 320);
        Ransel ransel = new Ransel("Reebok", "Hijau");
        Hoodie hoodie = new Hoodie("Coklat", "Polyester");
        Laptop laptop = new Laptop("Macbook", 8);

        ElektronikDanPakaian gabungan = new ElektronikDanPakaian(hoodie, laptop);

        System.out.println("\n--- Buku ---");
        buku.baca();
        buku.cetakInfo();

        System.out.println("\n--- Ransel ---");
        ransel.isi();
        ransel.keluar();
        ransel.cetakInfo();

        System.out.println("\n--- Hoodie ---");
        hoodie.pakai();
        hoodie.cuci();
        hoodie.cetakInfo();

        System.out.println("\n--- Laptop ---");
        laptop.nyalakan();
        laptop.matikan();
        laptop.cetakInfo();

        System.out.println("\n--- Barang Elektronik dan Pakaian ---");
        gabungan.pakaiHoodie();
        gabungan.nyalakanLaptop();
        gabungan.cetakInfo();
    }
}
