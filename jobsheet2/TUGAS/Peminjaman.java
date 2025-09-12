package TUGAS;

public class Peminjaman {
    private Member member;
    private Game game;
    private int lamaSewa;
 
    public Peminjaman(Member member, Game game, int lamaSewa) {
        this.member = member;
        this.game = game;
        this.lamaSewa = lamaSewa;
    }
 
    public double hitungTotalBayar() {
        return lamaSewa * game.getHargaSewa();
    }
 
    public void tampilkanDataPeminjaman() {
        System.out.println("------------------------------------");
        System.out.println("Data Peminjaman Game");
        System.out.println("ID Member: " + member.getId());
        System.out.println("Nama Member: " + member.getNama());
        System.out.println("Nama Game: " + game.getNamaGame());
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Harga Sewa per hari: Rp" + game.getHargaSewa());
        System.out.println("Total Bayar: Rp" + hitungTotalBayar());
        System.out.println("------------------------------------");
    }
}
