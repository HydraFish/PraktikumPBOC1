package FolderCivitasakademika;

/**
 * File      : Mahasiswa.java
 * Deskripsi : Program berisi kelas Mahasiswa untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class Mahasiswa extends Civitasakademika {
    //Atribut
    private String NIM;
    private Dosen Dosenwali;


    //Method
    //Konstruktor tanpa parameter
    public Mahasiswa(){
        super();
    }

    //Konstruktor dengan parameter
    public Mahasiswa(String Nama, String NIM, Dosen Doswal){
        super(Nama);
        this.NIM = NIM;
        this.Dosenwali = Doswal;
    }

    //Setter
    //Method untuk mengeset NIM
    public void setNIM(String newNIM){
        this.NIM = newNIM;
    }

    //Method untuk mengeset dosen wali
    public void setWali(Dosen newWali){
        this.Dosenwali = newWali;
    }

    //Getter
    //method untuk mendapat dosen wali
    public Dosen getDosenwali(){
        return Dosenwali;
    }

    //method override untuk mendapat nomor NIM
    @Override
    public String getNomor(){
        return NIM;
    }

    //Method lain
    //Method untuk mencetak data mahasiswa
    public void tampilDataMahasiswa(){
        System.out.println("---------Data Mahasiswa---------");
        System.out.println("NIM             : " + NIM);
        System.out.println("Nama            : " + this.getNama());
        System.out.println("Dosen wali      : " + Dosenwali.getNama());
        System.out.println("---------------------------------");
    }
}
