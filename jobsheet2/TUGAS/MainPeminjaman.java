package TUGAS;

public class MainPeminjaman {
    public static void main(String[] args) {
        Member anggota1 = new Member(101, "Ahmad");
        Game game1 = new Game("Cyberpunk 2077", 25000);

        Peminjaman peminjaman1 = new Peminjaman(anggota1, game1, 3); 
        peminjaman1.tampilkanDataPeminjaman();
 
        Member anggota2 = new Member(102, "Budi");
        Game game2 = new Game("The Witcher 3", 20000);
        Peminjaman peminjaman2 = new Peminjaman(anggota2, game2, 5); 
 
        peminjaman2.tampilkanDataPeminjaman();
    }
}