package FolderCivitasakademika;

/**
 * File      : MainCivitasakademika.java
 * Deskripsi : Program berisi kelas MainCivitasakademika untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class MainCivitasakademika {
    public static void main(String[] args) {

        // e. 2 objek dosen
        Dosen d1 = new Dosen("Christiano Ronaldo", "24060124177");
        Dosen d2 = new Dosen("Lionel Messi", "3807982156");

        // e. 5 objek mahasiswa
        Mahasiswa m1 = new Mahasiswa("Olise", "24060124120023", d1);
        Mahasiswa m2 = new Mahasiswa("Musiala", "24060124120024", d1);
        Mahasiswa m3 = new Mahasiswa("Diaz", "24060124120025", d2);
        Mahasiswa m4 = new Mahasiswa("Kane", "24060124120026", d2);
        Mahasiswa m5 = new Mahasiswa("Dembele", "24060124120027", d1);

        // b. objek seminar
        Seminar sem = new Seminar();

        // f. registrasi semua peserta (2 dosen + 5 mahasiswa)
        sem.registrasi(d1);
        sem.registrasi(d2);
        sem.registrasi(m1);
        sem.registrasi(m2);
        sem.registrasi(m3);
        sem.registrasi(m4);
        sem.registrasi(m5);

        // c. countPeserta
        System.out.println("Jumlah peserta seminar: " + sem.countPeserta());

        // g. tampilPeserta
        sem.tampilPeserta();

        // h. countMahasiswa
        System.out.println("Jumlah peserta mahasiswa: " + sem.countMahasiswa());

        // i. setWali
        System.out.println("=== Ubah Dosen Wali ===");
        m1.setWali(d2);

        // j. tampilDataMahasiswa
        System.out.println("=== Data Mahasiswa ===");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}