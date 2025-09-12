package TUGAS;

public class Game {
    private String namaGame;
    private double hargaSewa;
 
    public Game(String namaGame, double hargaSewa) {
        this.namaGame = namaGame;
        this.hargaSewa = hargaSewa;
    }
 
    public String getNamaGame() {
        return namaGame;
    }
 
    public double getHargaSewa() {
        return hargaSewa;
    }
}
