package FolderCivitasakademika;

/**
 * File      : Seminar.java
 * Deskripsi : Program berisi kelas Seminar untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class Seminar {
    //Atribut
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    //Method
    //Konstruktor
    //Konstruktor dengan parameter
    public Seminar(){
        pesertas = new Civitasakademika[100];
        banyakpeserta = 0;
    }


    //Method lain
    //Method untuk menghitung banyak peserta
    public int countPeserta(){
        return banyakpeserta;
    }

    //Method untuk meregistrasi peserta
    public void registrasi(Civitasakademika c){
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = c;
            banyakpeserta++;
        } 
        else {
            System.out.println("Peserta penuh!");
        }
    }

    //Method untuk menampilkan peserta
    public void tampilPeserta(){
        System.out.println("Daftar Peserta Seminar: ");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println(
                pesertas[i].getNomor() + " - " + pesertas[i].getNama()
            );
        }
        System.out.println();
    }

    //Method untuk menghitung banyak Mahasiswa
    public int countMahasiswa(){
        int jumlah = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                jumlah++;
            }
        }
        return jumlah;
    }
}