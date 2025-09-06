public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void tampilDataPersegi() {
        System.out.println("Panjang sisi persegi: " + this.sisi);
    }

    public int luasPersegi() {
        return this.sisi * this.sisi;
    }

    public int kelilingPersegi() {
        return 4 * this.sisi;
    }
}
