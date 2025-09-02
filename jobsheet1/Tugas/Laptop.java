package Tugas;

public class Laptop {
    String merek;
    int ramGB;

    public Laptop(String merek, int ramGB) {
        this.merek = merek;
        this.ramGB = ramGB;
    }

    public void nyalakan() {
        System.out.println("Menyalakan laptop merek " + merek);
    }

    public void matikan() {
        System.out.println("Mematikan laptop merek " + merek);
    }

    public void info() {
        System.out.println("Laptop merek: " + merek + ", RAM: " + ramGB);
    }

    public void cetakInfo() {
        info();
    }
}
