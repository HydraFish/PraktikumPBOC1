package FolderCivitasakademika;

/**
 * File      : Dosen.java
 * Deskripsi : Program berisi kelas Dosen untuk menunjukkan polimorfisme
 * Nama      : Haydar Rafi' Sultansyah
 * NIM       : 24060124120023
 */

public class Dosen extends Civitasakademika {
    //Atribut
    private String NIP;

    //Method
    //Konstruktor
    //Konstruktor tanpa parameter
    public Dosen(){
        super();
    }

    //Konstruktor dengan parameter
    public Dosen(String Nama, String NIP){
        super(Nama);
        this.NIP = NIP;
    }


    //Setter
    //Mengeset NIP
    public void setNIP(String newNIP){
        this.NIP = newNIP;
    }

    //Getter
    //Override untuk mengambil nomor NIP
    @Override
    public String getNomor(){
        return NIP;
    }
}
