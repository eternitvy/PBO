public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        System.out.println();

        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs2.nim = 2441173;
        mhs2.nama = "Abel";
        mhs2.alamat = "Dau";
        mhs2.kelas = "2C";
        mhs2.tampilBiodata();
        System.out.println();

        mhs3.nim = 2441038;
        mhs3.nama = "Nayla";
        mhs3.alamat = "Suhat";
        mhs3.kelas = "2H";
        mhs3.tampilBiodata();
    }
}
